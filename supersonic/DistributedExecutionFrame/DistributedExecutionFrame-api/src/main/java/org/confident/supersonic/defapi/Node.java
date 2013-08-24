/**
 * confident
 */
package org.confident.supersonic.defapi;

/**
 * @author Geevarughese John
 * 
 */
public interface Node {

	NodeInfo getNodeInfo();

	void start();

	void connect();

	void stop();

}
