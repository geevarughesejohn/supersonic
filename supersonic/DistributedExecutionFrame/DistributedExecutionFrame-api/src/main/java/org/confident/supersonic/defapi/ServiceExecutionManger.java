/**
 * confident
 */
package org.confident.supersonic.defapi;

/**
 * @author Geevarughese John
 * 
 */
public interface ServiceExecutionManger {

	void addService(ServiceInfo serviceInfo, int numberofdedicatedThread, int numberofVisitingThread);

	void removeService(ServiceInfo serviceInfo, int numberofdedicatedThread, int numberofVisitingThread);

	int getMaximumNumberofThreads();

}
