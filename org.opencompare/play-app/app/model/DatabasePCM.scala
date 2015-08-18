package model

import org.opencompare.api.java.PCMContainer

/**
 * Created by gbecan on 12/12/14.
 */
class DatabasePCM(val id : Option[String], var pcmContainer : Option[PCMContainer]) {

  def hasIdentifier() : Boolean = this.id.isDefined
}
