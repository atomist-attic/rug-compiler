package com.atomist.rug.compiler

import com.atomist.source.ArtifactSource

trait CompilerRegistry {

  def findAll(source: ArtifactSource): Seq[Compiler]

}
