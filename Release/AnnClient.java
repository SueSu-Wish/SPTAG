/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class AnnClient {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected AnnClient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnnClient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        SPTAGClientJNI.delete_AnnClient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AnnClient(String p_serverAddr, String p_serverPort) {
    this(SPTAGClientJNI.new_AnnClient(p_serverAddr, p_serverPort), true);
  }

  public void SetTimeoutMilliseconds(int p_timeout) {
    SPTAGClientJNI.AnnClient_SetTimeoutMilliseconds(swigCPtr, this, p_timeout);
  }

  public void SetSearchParam(String p_name, String p_value) {
    SPTAGClientJNI.AnnClient_SetSearchParam(swigCPtr, this, p_name, p_value);
  }

  public void ClearSearchParam() {
    SPTAGClientJNI.AnnClient_ClearSearchParam(swigCPtr, this);
  }

  public Result[] Search(byte[] p_data, int p_resultNum, String p_valueType, boolean p_withMetaData) {
    return SPTAGClientJNI.AnnClient_Search(swigCPtr, this, p_data, p_resultNum, p_valueType, p_withMetaData);
}

  public boolean IsConnected() {
    return SPTAGClientJNI.AnnClient_IsConnected(swigCPtr, this);
  }

}
