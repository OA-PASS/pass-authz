/*
 * Copyright 2018 Johns Hopkins University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dataconservancy.pass.authz;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dataconservancy.pass.model.User;

/**
 * @author apb@jhu.edu
 * @author jrm@jhu.edu
 */
public class AuthUser {

    private String name;

    private String givenName;

    private String surname;

    private String email;

    private List<String> locatorIds = new ArrayList<>();

    private URI id;

    private String principal;

    private final Set<String> domains = new HashSet<>();

    private Set<String> scopedAffiliations = new HashSet<>();

    private User user;

    /**
     * the list of locator idsfor the user
     *
     * @return the list of ids
     */
    public List<String> getLocatorIds() {
        return locatorIds;
    }

    /**
     * set the user's locator ids
     *
     * @param locatorIds the durable list of ids
     */
    public void setLocatorIds(List<String> locatorIds) {
        this.locatorIds = locatorIds;
    }

    /**
     * Get the user's email address
     *
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the user's email address
     *
     * @param email the user's email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the repository id for the user which was assigned to this person's User object by the repository
     *
     * @return the repository id
     */
    public URI getId() {
        return id;
    }

    /**
     * Set the id for the user which was assigned to this person's User object by the repository
     *
     * @param id - the repository id
     */
    public void setId(URI id) {
        this.id = id;
    }

    /**
     * Get the display name
     *
     * @return the display name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the display name for the user
     *
     * @param name - the display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the given name for the user, as determined by the authentication provider.  Differs from the display name
     * as the given name is typically the user's first name.
     *
     * @return the given name
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Set the given name for the user, as determined by the authentication provider. Differs from the display name
     * as the given name is typically the user's first name.
     *
     * @param givenName the given name
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * Get the surname for the user, as determined by the authentication provider. Differs from the display name
     * as the surname is only the user's last name.
     *
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the surname for the user, as determined by the authentication provider. Differs from the display name
     * as the surname is only the user's last name.
     *
     * @param surname the surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get all domains in which the user has affiliation..
     * <p>
     * The domain qualifies the username (eppn, in shib), and scoped affiliations. Typically, it is the institution
     * (e.g. jonhshopkins.edu)
     * </p>
     *
     * @return Set of all domains, or empty if none;
     */
    public Set<String> getDomains() {
        return domains;
    }

    /**
     * Get the user's principal, identifying them in their authorization domain.
     * <p>
     * In shib terms, this is eppn;
     * </p>
     *
     * @return principal
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Set the user's principal.
     *
     * @param principal the user's principal
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * Associate a User resource with this AuthUser.
     *
     * @param user The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Get the associated User resource, if defined/provided. May be null.
     *
     * @return The user, if present.
     */
    public User getUser() {
        return user;
    }

    /**
     * The affiliation(s) of the user, per domain.  Typically in the form {@code &lt;affiliation&gt;@&lt;domain&gt;}
     *
     * @return the user's affiliation(s)
     */
    public Set<String> getScopedAffiliations() {
        return scopedAffiliations;
    }

    /**
     * The affiliation(s) of the user, per domain.  Typically in the form {@code &lt;affiliation&gt;@&lt;domain&gt;}
     *
     * @param scopedAffiliations the user's affiliation(s) for each domain
     */
    public void setScopedAffiliations(Set<String> scopedAffiliations) {
        this.scopedAffiliations = scopedAffiliations;
    }
}
