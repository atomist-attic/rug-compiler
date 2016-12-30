package com.atomist.rug.compiler

import com.atomist.source.ArtifactSource

trait Compiler {

  def compile(source: ArtifactSource): ArtifactSource

  def supports(source: ArtifactSource): Boolean
  
  def name: String
  
  def extensions: Seq[String]
  
  def order: Int = Integer.MAX_VALUE
}
