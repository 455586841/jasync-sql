package com.github.mauricio.postgresql.parsers

import org.specs2.mutable.Specification
import org.jboss.netty.buffer.ChannelBuffers
import com.github.mauricio.postgresql.messages.backend.{ProcessData, Message}

/**
 * User: Maurício Linhares
 * Date: 2/28/12
 * Time: 11:33 PM
 */

class ParserKSpec extends Specification {

  val parser = BackendKeyDataParser

  "parserk" should {

    "correctly parse the message" in {

      val buffer = ChannelBuffers.dynamicBuffer()
      buffer.writeInt(10)
      buffer.writeInt(20)

      val data = parser.parseMessage( buffer ).asInstanceOf[ProcessData]

      List(
        data.name === Message.BackendKeyData,
        data.processId === 10,
        data.secretKey === 20
      )
    }

  }

}
