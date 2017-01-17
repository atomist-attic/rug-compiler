package com.atomist.rug.compiler

import java.util.Set

import com.atomist.source.ArtifactSource

trait Compiler {

  def compile(source: ArtifactSource): ArtifactSource

  def supports(source: ArtifactSource): Boolean
  
  def name: String
  
  def extensions: Set[String]
  
  def order: Int = Integer.MAX_VALUE
}
