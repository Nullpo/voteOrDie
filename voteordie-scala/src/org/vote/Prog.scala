package org.vote

object Prog {
  def main(args: Array[String]) {
    val candidate1 = "Pepe";
    val candidate2 = "José";
    val candidate3 = "Fernando";
    val vote1 = Vote(candidate1)
    val vote2 = Vote(candidate2)
    val vote3 = Vote(candidate3)
    val vote4 = Vote(candidate1)

    Box.plurality() // Sets the vote system

    Box.addVote(vote2)

    Box.addVote(vote4)
    Box.addVote(vote1)
    Box.addVote(vote1)
    Box.addVote(vote1)
    Box.addVote(vote3)
    Box.addVote(vote3)
    Box.addVote(vote1)
    Box.addVote(vote1)
    Box.addVote(vote1)
    Box.addVote(vote3)
    Box.addVote(vote1)
    Box.addVote(vote1)
    Box.addVote(vote3)

    println(Box.votes)
    println(Box.votationResults)
    println("THe winner is!" + Box.theWinnerIs)
  }
}