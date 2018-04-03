package scalakim
import ml.dmlc.mxnet._
import ml.dmlc.mxnet.module.{Module}

object App {

  def main(args : Array[String]) {
    val mod = Module.loadCheckpoint("kim", 100) // modelPrefix="kim", loadModelEpoch=100
    var dShape = Shape(1000, 47, 300)
    var dataDesc = IndexedSeq(DataDesc("input_0", dShape))
    mod.bind(dataShapes = dataDesc)
    val (argParams, auxParams) = mod.getParams
    //mod.initParams()
    mod.forward(new DataBatch(
      data = IndexedSeq(NDArray.ones(dShape)),
      label = null, index = null, pad = 0))
    var result = mod.getOutputs()(0)(0)
    println("MxNet (Scala) Output:")
    println("Shape of output:")
    println(result.shape)
    println("First three rows of data:")
    println(result.at(0).toArray.map(_.toString()).mkString(" "))
    println(result.at(1).toArray.map(_.toString()).mkString(" "))
    println(result.at(2).toArray.map(_.toString()).mkString(" "))
  }
}