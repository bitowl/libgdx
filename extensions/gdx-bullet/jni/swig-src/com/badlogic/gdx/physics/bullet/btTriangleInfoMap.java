/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleInfoMap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btTriangleInfoMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTriangleInfoMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTriangleInfoMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_convexEpsilon(float value) {
    gdxBulletJNI.btTriangleInfoMap_m_convexEpsilon_set(swigCPtr, this, value);
  }

  public float getM_convexEpsilon() {
    return gdxBulletJNI.btTriangleInfoMap_m_convexEpsilon_get(swigCPtr, this);
  }

  public void setM_planarEpsilon(float value) {
    gdxBulletJNI.btTriangleInfoMap_m_planarEpsilon_set(swigCPtr, this, value);
  }

  public float getM_planarEpsilon() {
    return gdxBulletJNI.btTriangleInfoMap_m_planarEpsilon_get(swigCPtr, this);
  }

  public void setM_equalVertexThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_m_equalVertexThreshold_set(swigCPtr, this, value);
  }

  public float getM_equalVertexThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_m_equalVertexThreshold_get(swigCPtr, this);
  }

  public void setM_edgeDistanceThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_m_edgeDistanceThreshold_set(swigCPtr, this, value);
  }

  public float getM_edgeDistanceThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_m_edgeDistanceThreshold_get(swigCPtr, this);
  }

  public void setM_maxEdgeAngleThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_m_maxEdgeAngleThreshold_set(swigCPtr, this, value);
  }

  public float getM_maxEdgeAngleThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_m_maxEdgeAngleThreshold_get(swigCPtr, this);
  }

  public void setM_zeroAreaThreshold(float value) {
    gdxBulletJNI.btTriangleInfoMap_m_zeroAreaThreshold_set(swigCPtr, this, value);
  }

  public float getM_zeroAreaThreshold() {
    return gdxBulletJNI.btTriangleInfoMap_m_zeroAreaThreshold_get(swigCPtr, this);
  }

  public btTriangleInfoMap() {
    this(gdxBulletJNI.new_btTriangleInfoMap(), true);
  }

  public int calculateSerializeBufferSize() {
    return gdxBulletJNI.btTriangleInfoMap_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(SWIGTYPE_p_void dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return gdxBulletJNI.btTriangleInfoMap_serialize(swigCPtr, this, SWIGTYPE_p_void.getCPtr(dataBuffer), SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void deSerialize(btTriangleInfoMapData data) {
    gdxBulletJNI.btTriangleInfoMap_deSerialize(swigCPtr, this, btTriangleInfoMapData.getCPtr(data), data);
  }

}
