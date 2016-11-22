package com.atomist.rug.compiler

import java.util.ServiceLoader

import com.atomist.source.ArtifactSource
import com.typesafe.scalalogging.LazyLogging

import scala.collection.JavaConverters._

object ServiceLoaderCompilerRegistry
  extends CompilerRegistry with LazyLogging {

  private lazy val compilers: Seq[Compiler] = ServiceLoader.load(classOf[Compiler]).asScala.toSeq

  override def findAll(source: ArtifactSource): Seq[Compiler] =
    compilers.filter(c => c.supports(source))

}
