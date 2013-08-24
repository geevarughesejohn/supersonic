/**
 * confident
 */
package org.confident.supersonic.defapi;

/**
 * Node
 * 
 * @author Geevarughese John
 * 
 */
public interface Node {

	/**
	 * @return NodeInfo - Node information object
	 */
	NodeInfo getNodeInfo();

	/**
	 * start the node
	 */
	void start();

	/**
	 * connect the node to group of nodes
	 */
	void connect();

	/**
	 * stop the node
	 */
	void stop();

}
