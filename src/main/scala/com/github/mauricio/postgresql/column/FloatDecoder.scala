package com.github.mauricio.postgresql.column

/**
 * User: Maurício Linhares
 * Date: 3/5/12
 * Time: 9:47 AM
 */

object FloatDecoder extends ColumnDecoder {
  def decode(value: String): Float = {
    value.toFloat
  }
}
