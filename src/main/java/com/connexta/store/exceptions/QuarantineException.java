/*
 * Copyright (c) 2019 Connexta, LLC
 *
 * Released under the GNU Lesser General Public License version 3; see
 * https://www.gnu.org/licenses/lgpl-3.0.html
 */
package com.connexta.store.exceptions;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import com.connexta.store.exceptions.common.DetailedResponseStatusException;

public class QuarantineException extends DetailedResponseStatusException {

  public QuarantineException(String reason, Throwable cause) {
    super(INTERNAL_SERVER_ERROR, reason, cause);
  }

  public QuarantineException(String reason) {
    super(INTERNAL_SERVER_ERROR, reason);
  }
}
