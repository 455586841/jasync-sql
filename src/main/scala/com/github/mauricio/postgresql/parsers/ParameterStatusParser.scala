package com.github.mauricio.postgresql.parsers

import org.jboss.netty.buffer.ChannelBuffer
import com.github.mauricio.postgresql.ChannelUtils
import com.github.mauricio.postgresql.messages.backend.{ParameterStatusMessage, Message}

/**
 * User: Maurício Linhares
 * Date: 2/25/12
 * Time: 7:06 PM
 */

object ParameterStatusParser extends MessageParser {

  import ChannelUtils._

  override def parseMessage(b: ChannelBuffer): Message = {
    new ParameterStatusMessage( readCString(b), readCString(b) )
  }

}
