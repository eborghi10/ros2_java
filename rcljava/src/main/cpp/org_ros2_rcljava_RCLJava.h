/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_ros2_rcljava_RCLJava */

#ifndef _Included_org_ros2_rcljava_RCLJava
#define _Included_org_ros2_rcljava_RCLJava
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeRCLJavaInit
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_ros2_rcljava_RCLJava_nativeRCLJavaInit
  (JNIEnv *, jclass);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeCreateNodeHandle
 * Signature: (Ljava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_org_ros2_rcljava_RCLJava_nativeCreateNodeHandle
  (JNIEnv *, jclass, jstring);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeGetRMWIdentifier
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_ros2_rcljava_RCLJava_nativeGetRMWIdentifier
  (JNIEnv *, jclass);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeOk
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_ros2_rcljava_RCLJava_nativeOk
  (JNIEnv *, jclass);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeGetZeroInitializedWaitSet
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_ros2_rcljava_RCLJava_nativeGetZeroInitializedWaitSet
  (JNIEnv *, jclass);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeWaitSetInit
 * Signature: (JIII)V
 */
JNIEXPORT void JNICALL Java_org_ros2_rcljava_RCLJava_nativeWaitSetInit
  (JNIEnv *, jclass, jlong, jint, jint, jint);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeWaitSetClearSubscriptions
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_ros2_rcljava_RCLJava_nativeWaitSetClearSubscriptions
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeWaitSetAddSubscription
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_org_ros2_rcljava_RCLJava_nativeWaitSetAddSubscription
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeWait
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_ros2_rcljava_RCLJava_nativeWait
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeTake
 * Signature: (JLjava/lang/Class;)Ljava/lang/Object;
 */
JNIEXPORT jobject JNICALL Java_org_ros2_rcljava_RCLJava_nativeTake
  (JNIEnv *, jclass, jlong, jclass);

/*
 * Class:     org_ros2_rcljava_RCLJava
 * Method:    nativeShutdown
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_ros2_rcljava_RCLJava_nativeShutdown
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif