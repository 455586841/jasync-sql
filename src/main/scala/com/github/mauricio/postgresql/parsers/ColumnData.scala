package com.github.mauricio.postgresql.parsers

import com.github.mauricio.postgresql.column.ColumnDecoder
import com.github.mauricio.postgresql.util.Log

/**
 * User: Maurício Linhares
 * Date: 3/1/12
 * Time: 10:33 PM
 */

class ColumnData(
  val name: String,
  val tableObjectId: Int,
  val columnNumber: Int,
  val dataType: Int,
  val dataTypeSize: Int,
  val dataTypeModifier: Int,
  val fieldFormat: Int ) {

  val log = Log.get[ColumnData]

  val decoder = ColumnDecoder.decoderFor( this.dataType )

}
