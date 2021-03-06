package org.vote

/* Plurality voting system algorithm.
 * 
 * Plurality is a single-winner voting system, 
 * the winner is the candidate with more votes. There's no
 * requisite to win (i.e. doesn't need more than 50% of votes to win)
 * <br />
 * This is a synonym of:
 * <br />  - Single Majority
 * <br />  - Relative Majority
 * <br />  - Common Majority
 * <br />  - Ordinary Majority
 */
object Plurality extends RecountSystem {

  override def getWithMoreVotes(elems: List[(AnyRef, Integer)]): (AnyRef, Integer) =
    if (elems != List()) (elems.foldLeft(elems.head) { (a, b) => maxOf(a, b) }) else (null, 0)

  def votationResults(votes: List[Vote]): List[(AnyRef, Integer)] =
    (collection.Set.empty[Vote] ++ votes).map(
      x => countOcurrencesOf(x, votes, 0))(collection.breakOut)

  def countOcurrencesOf(E: Vote, list: List[AnyRef], Count: Integer): (AnyRef, Integer) =
    list match {
      case cabeza :: t if cabeza == E => countOcurrencesOf(E, t, Count + 1)
      case cabeza :: t => countOcurrencesOf(E, t, Count)
      case List() => (E.value, Count)
    }
}