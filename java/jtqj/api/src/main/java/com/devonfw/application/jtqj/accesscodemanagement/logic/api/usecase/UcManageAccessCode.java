package com.devonfw.application.jtqj.accesscodemanagement.logic.api.usecase;

import com.devonfw.application.jtqj.accesscodemanagement.logic.api.to.AccessCodeEto;

/**
 * Interface of UcManageAccessCode to centralize documentation and signatures of methods.
 */
public interface UcManageAccessCode {

  /**
   * Deletes an accessCode from the database by its id 'accessCodeId'. Decreases the count of customers of the queue
   * assigned to the access code by one
   *
   * @param accessCodeId Id of the accessCode to delete
   * @return boolean <code>true</code> if the accessCode can be deleted, <code>false</code> otherwise
   */
  boolean deleteAccessCode(long accessCodeId);

  /**
   * Saves a accessCode and store it in the database. Increases the count of customers of the queue assigned to the
   * access code by one
   *
   * @param accessCode the {@link AccessCodeEto} to create.
   * @return the new {@link AccessCodeEto} that has been saved with ID and version.
   */
  AccessCodeEto saveAccessCode(AccessCodeEto accessCode);

}
