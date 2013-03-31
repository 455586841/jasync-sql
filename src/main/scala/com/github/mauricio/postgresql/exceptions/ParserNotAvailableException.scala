package com.github.mauricio.postgresql.exceptions

/**
 * User: Maurício Linhares
 * Date: 3/4/12
 * Time: 12:16 AM
 */

class ParserNotAvailableException(t: Char)
  extends RuntimeException("There is no parser available for message type '%s'".format(t))