package com.atomist.rug.compiler

trait CompilerListener {
  
  def compileStarted(path: String)
  
  def compileSucceeded(path: String, content: String)
  
  def compileFailed(path: String)
  
}

trait CompilerListenerEnabled {
  
  def registerListener(listener: CompilerListener)
  
}
