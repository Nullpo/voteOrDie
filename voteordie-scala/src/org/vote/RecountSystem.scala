package org.vote

trait RecountSystem {
  def theWinnerIs(votes: List[Vote]): (AnyRef, Integer) = getWithMoreVotes(votationResults(votes))
  protected def maxOf(A: (AnyRef, Integer), B: (AnyRef, Integer)): (AnyRef, Integer) = if (A._2 > B._2) A else B

  def votationResults(votes: List[Vote]): List[(AnyRef, Integer)]
  protected def getWithMoreVotes(elems: List[(AnyRef, Integer)]): (AnyRef, Integer)
}