package org.vote

case class Vote(elem: AnyRef) {
  var value = elem
  override def toString = this.value.toString()
}