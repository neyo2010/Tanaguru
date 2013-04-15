/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2011  Open-S Company
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tanaguru.entity.audit;

import java.util.Collection;
import org.opens.tanaguru.entity.subject.Page;

/**
 * 
 * @author jkowalczyk
 */
public interface SSP extends TextContent {

    /**
     *
     * @return the string representation of the DOM
     */
    String getDOM();

    /**
     *
     * @return the page
     */
    Page getPage();

    /**
     * 
     * @return the charset
     */
    String getCharset();

    /**
     *
     * @return the doctype
     */
    String getDoctype();

    /**
     * 
     * @return the list of related raw content of the ssp
     */
    Collection<RelatedContent> getRelatedContentSet();

    /**
     *
     * @param domString
     *            the string representation of the DOM to set
     */
    void setDOM(String domString);

    /**
     *
     * @param page
     *            the page to set
     */
    void setPage(Page page);

    /**
     * 
     * @param charset
     *          the charset of the SSP
     */
    void setCharset(String charset);

    /**
     * 
     * @param doctype
     *              the doctype of the SSP
     */
    void setDoctype(String doctype);

    /**
     *
     * @param contentList
     *          The content list to add
     */
    public void addAllRelationContent(Collection<RelatedContent> contentList);

    /**
     *
     * @param content
     *              The content to add
     */
    public void addRelatedContent(RelatedContent content);

}