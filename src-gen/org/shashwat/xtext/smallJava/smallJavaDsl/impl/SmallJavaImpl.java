/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.shashwat.xtext.smallJava.smallJavaDsl.Attribute;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Small Java</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmallJavaImpl extends MinimalEObjectImpl.Container implements SmallJava
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected SmallJava parent;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmallJavaImpl()
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
    return SmallJavaDslPackage.Literals.SMALL_JAVA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.SMALL_JAVA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJava getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (SmallJava)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallJavaDslPackage.SMALL_JAVA__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJava basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(SmallJava newParent)
  {
    SmallJava oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.SMALL_JAVA__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE, oldAttribute, newAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(Attribute newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE, newAttribute, newAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SmallJavaDslPackage.SMALL_JAVA__NAME:
        return getName();
      case SmallJavaDslPackage.SMALL_JAVA__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE:
        return getAttribute();
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
      case SmallJavaDslPackage.SMALL_JAVA__NAME:
        setName((String)newValue);
        return;
      case SmallJavaDslPackage.SMALL_JAVA__PARENT:
        setParent((SmallJava)newValue);
        return;
      case SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE:
        setAttribute((Attribute)newValue);
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
      case SmallJavaDslPackage.SMALL_JAVA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmallJavaDslPackage.SMALL_JAVA__PARENT:
        setParent((SmallJava)null);
        return;
      case SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE:
        setAttribute((Attribute)null);
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
      case SmallJavaDslPackage.SMALL_JAVA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmallJavaDslPackage.SMALL_JAVA__PARENT:
        return parent != null;
      case SmallJavaDslPackage.SMALL_JAVA__ATTRIBUTE:
        return attribute != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SmallJavaImpl
