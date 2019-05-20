/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class AnnIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected AnnIndex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnnIndex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        SPTAGJNI.delete_AnnIndex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AnnIndex(int p_dimension) {
    this(SPTAGJNI.new_AnnIndex__SWIG_0(p_dimension), true);
  }

  public AnnIndex(String p_algoType, String p_valueType, int p_dimension) {
    this(SPTAGJNI.new_AnnIndex__SWIG_1(p_algoType, p_valueType, p_dimension), true);
  }

  public void SetBuildParam(String p_name, String p_value) {
    SPTAGJNI.AnnIndex_SetBuildParam(swigCPtr, this, p_name, p_value);
  }

  public void SetSearchParam(String p_name, String p_value) {
    SPTAGJNI.AnnIndex_SetSearchParam(swigCPtr, this, p_name, p_value);
  }

  public boolean Build(byte[] p_data, int p_num) {
    return SPTAGJNI.AnnIndex_Build(swigCPtr, this, p_data, p_num);
  }

  public boolean BuildWithMetaData(byte[] p_data, byte[] p_meta, int p_num) {
    return SPTAGJNI.AnnIndex_BuildWithMetaData(swigCPtr, this, p_data, p_meta, p_num);
  }

  public Result[] Search(byte[] p_data, int p_resultNum) { return SPTAGJNI.AnnIndex_Search(swigCPtr, this, p_data, p_resultNum); }

  public Result[] SearchWithMetaData(byte[] p_data, int p_resultNum) { return SPTAGJNI.AnnIndex_SearchWithMetaData(swigCPtr, this, p_data, p_resultNum); }

  public boolean ReadyToServe() {
    return SPTAGJNI.AnnIndex_ReadyToServe(swigCPtr, this);
  }

  public boolean Save(String p_saveFile) {
    return SPTAGJNI.AnnIndex_Save(swigCPtr, this, p_saveFile);
  }

  public boolean Add(byte[] p_data, int p_num) {
    return SPTAGJNI.AnnIndex_Add(swigCPtr, this, p_data, p_num);
  }

  public boolean AddWithMetaData(byte[] p_data, byte[] p_meta, int p_num) {
    return SPTAGJNI.AnnIndex_AddWithMetaData(swigCPtr, this, p_data, p_meta, p_num);
  }

  public boolean Delete(byte[] p_data, int p_num) {
    return SPTAGJNI.AnnIndex_Delete(swigCPtr, this, p_data, p_num);
  }

  public static AnnIndex Load(String p_loaderFile) {
    return new AnnIndex(SPTAGJNI.AnnIndex_Load(p_loaderFile), true);
  }

}
