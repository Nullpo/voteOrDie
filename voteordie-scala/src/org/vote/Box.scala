package org.vote

object Box extends Recountable{
  var votes: List[Vote] = List[Vote]()
  var recountSystem: RecountSystem = null

  def addVote(vote: Vote) {
    this.votes = vote :: votes
  }
  
  def theWinnerIs() : (AnyRef,Integer) = this.recountSystem.theWinnerIs(votes)
  
  def votationResults() : List[(AnyRef,Integer)] = this.recountSystem.votationResults(votes)
  
  def plurality() = 
	  this.recountSystem = Plurality
  
  def setAlgorytm(rs :RecountSystem) =
    this.recountSystem = rs
}