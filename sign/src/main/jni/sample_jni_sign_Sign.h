/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sample_jni_sign_Sign */

#ifndef _Included_sample_jni_sign_Sign
#define _Included_sample_jni_sign_Sign
#ifdef __cplusplus
extern "C" {
#endif
#undef sample_jni_sign_Sign_FLAG
#define sample_jni_sign_Sign_FLAG 64L
/*
 * Class:     sample_jni_sign_Sign
 * Method:    getContext
 * Signature: ()Landroid/content/Context;
 */
JNIEXPORT jobject JNICALL Java_sample_jni_sign_Sign_getContext
  (JNIEnv *, jclass);

/*
 * Class:     sample_jni_sign_Sign
 * Method:    getSign
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_sample_jni_sign_Sign_getSign
  (JNIEnv *, jclass);

/*
 * Class:     sample_jni_sign_Sign
 * Method:    say
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_sample_jni_sign_Sign_say
  (JNIEnv *, jclass, jstring);

#ifdef __cplusplus
}
#endif
#endif
