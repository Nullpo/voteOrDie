package org.vote

trait Recountable {
  def theWinnerIs(): (AnyRef, Integer)
  def votationResults(): List[(AnyRef, Integer)]
}