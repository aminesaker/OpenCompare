package org.diverse.pcm.io.bestbuy.filters

import org.diverse.pcm.io.bestbuy.ProductInfo

import scala.util.Random

/**
 * Created by gbecan on 4/7/15.
 */
trait RandomFilter extends ProductFilter {

  abstract override def select(products : List[ProductInfo]) : List[ProductInfo] = {
    Random.shuffle(super.select(products)).take(numberOfProducts)
  }

  def numberOfProducts : Int


}
