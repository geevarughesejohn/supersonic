/**
 * confident
 */
package org.confident.supersonic.defapi;

/**
 * @author Geevarughese John
 * 
 */
public interface ServiceCaller {

	/**
	 * call the service
	 * 
	 * @param serviceInfo
	 * @param arguments
	 */
	void call(ServiceInfo serviceInfo, Argument[] arguments);

}
