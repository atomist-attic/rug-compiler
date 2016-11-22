package com.atomist.rug.compiler

import com.atomist.source.ArtifactSource

trait Compiler { //extends (ArtifactSource => ArtifactSource) {

  //override def apply(source: ArtifactSource): ArtifactSource = compile(source)

  def compile(source: ArtifactSource): ArtifactSource

  def supports(source: ArtifactSource): Boolean

}
