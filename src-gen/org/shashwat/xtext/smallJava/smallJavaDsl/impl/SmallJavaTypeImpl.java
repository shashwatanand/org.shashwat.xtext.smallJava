/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Small Java Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmallJavaTypeImpl extends DatatypeImpl implements SmallJavaType
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SmallJava type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmallJavaTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmallJavaDslPackage.Literals.SMALL_JAVA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJava getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (SmallJava)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallJavaDslPackage.SMALL_JAVA_TYPE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJava basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(SmallJava newType)
  {
    SmallJava oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.SMALL_JAVA_TYPE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmallJavaDslPackage.SMALL_JAVA_TYPE__TYPE:
        if (resolve) return getType();
        return basicGetType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmallJavaDslPackage.SMALL_JAVA_TYPE__TYPE:
        setType((SmallJava)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmallJavaDslPackage.SMALL_JAVA_TYPE__TYPE:
        setType((SmallJava)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmallJavaDslPackage.SMALL_JAVA_TYPE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //SmallJavaTypeImpl
