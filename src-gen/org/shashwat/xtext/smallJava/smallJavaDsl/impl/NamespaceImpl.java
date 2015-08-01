/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.shashwat.xtext.smallJava.smallJavaDsl.Import;
import org.shashwat.xtext.smallJava.smallJavaDsl.Namespace;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava;
import org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.NamespaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.NamespaceImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.NamespaceImpl#getSmallJava <em>Small Java</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends MinimalEObjectImpl.Container implements Namespace
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getSmallJava() <em>Small Java</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmallJava()
   * @generated
   * @ordered
   */
  protected SmallJava smallJava;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceImpl()
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
    return SmallJavaDslPackage.Literals.NAMESPACE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.NAMESPACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, SmallJavaDslPackage.NAMESPACE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJava getSmallJava()
  {
    return smallJava;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSmallJava(SmallJava newSmallJava, NotificationChain msgs)
  {
    SmallJava oldSmallJava = smallJava;
    smallJava = newSmallJava;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.NAMESPACE__SMALL_JAVA, oldSmallJava, newSmallJava);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmallJava(SmallJava newSmallJava)
  {
    if (newSmallJava != smallJava)
    {
      NotificationChain msgs = null;
      if (smallJava != null)
        msgs = ((InternalEObject)smallJava).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallJavaDslPackage.NAMESPACE__SMALL_JAVA, null, msgs);
      if (newSmallJava != null)
        msgs = ((InternalEObject)newSmallJava).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallJavaDslPackage.NAMESPACE__SMALL_JAVA, null, msgs);
      msgs = basicSetSmallJava(newSmallJava, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaDslPackage.NAMESPACE__SMALL_JAVA, newSmallJava, newSmallJava));
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
      case SmallJavaDslPackage.NAMESPACE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SmallJavaDslPackage.NAMESPACE__SMALL_JAVA:
        return basicSetSmallJava(null, msgs);
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
      case SmallJavaDslPackage.NAMESPACE__NAME:
        return getName();
      case SmallJavaDslPackage.NAMESPACE__IMPORTS:
        return getImports();
      case SmallJavaDslPackage.NAMESPACE__SMALL_JAVA:
        return getSmallJava();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmallJavaDslPackage.NAMESPACE__NAME:
        setName((String)newValue);
        return;
      case SmallJavaDslPackage.NAMESPACE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case SmallJavaDslPackage.NAMESPACE__SMALL_JAVA:
        setSmallJava((SmallJava)newValue);
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
      case SmallJavaDslPackage.NAMESPACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmallJavaDslPackage.NAMESPACE__IMPORTS:
        getImports().clear();
        return;
      case SmallJavaDslPackage.NAMESPACE__SMALL_JAVA:
        setSmallJava((SmallJava)null);
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
      case SmallJavaDslPackage.NAMESPACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmallJavaDslPackage.NAMESPACE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SmallJavaDslPackage.NAMESPACE__SMALL_JAVA:
        return smallJava != null;
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

} //NamespaceImpl
