/*******************************************************************************
 * Copyright 2015 The MITRE Corporation
 *   and the MIT Kerberos and Internet Trust Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.mitre.openid.connect.repository;

import org.mitre.openid.connect.model.UserInfo;

/**
 * UserInfo repository interface
 * 
 * @author Michael Joseph Walsh
 *
 */
public interface UserInfoRepository {

	/**
	 * Persists a UserInfo object, if possible.
	 * 
	 * @param user
	 * @return the persisted object
	 */
	public UserInfo save(UserInfo userInfo);

	/**
	 * Removes the given UserInfo from the repository, if possible.
	 * 
	 * @param userInfo
	 *            the UserInfo object to remove
	 */
	public void remove(UserInfo userInfo);

	/**
	 * Get a UserInfo object by its preferred_username field
	 * @param username
	 * @return
	 */
	public UserInfo getByUsername(String username);

}
