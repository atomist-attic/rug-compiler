package com.atomist.rug.compiler

import com.atomist.source.ArtifactSource

trait Compiler {

  def compile(source: ArtifactSource): ArtifactSource

  def supports(source: ArtifactSource): Boolean
  
  def name: String
  
  def extension: String
}
