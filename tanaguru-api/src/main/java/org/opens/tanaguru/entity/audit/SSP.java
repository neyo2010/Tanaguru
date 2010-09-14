package org.opens.tanaguru.entity.audit;

import java.util.Set;
import org.opens.tanaguru.entity.subject.Page;

/**
 * 
 * @author ADEX
 * @version 1.0.0
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
    Set<? extends RelatedContent> getRelatedContentSet();

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
    public void addAllRelationContent(Set<? extends RelatedContent> contentList);

    /**
     *
     * @param content
     *              The content to add
     */
    public void addRelatedContent(RelatedContent content);

}
