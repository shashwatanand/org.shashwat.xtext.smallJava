/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.shashwat.xtext.smallJava.smallJavaDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallJavaDslFactoryImpl extends EFactoryImpl implements SmallJavaDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmallJavaDslFactory init()
  {
    try
    {
      SmallJavaDslFactory theSmallJavaDslFactory = (SmallJavaDslFactory)EPackage.Registry.INSTANCE.getEFactory(SmallJavaDslPackage.eNS_URI);
      if (theSmallJavaDslFactory != null)
      {
        return theSmallJavaDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmallJavaDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmallJavaDslPackage.SMALL_JAVA: return createSmallJava();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJava createSmallJava()
  {
    SmallJavaImpl smallJava = new SmallJavaImpl();
    return smallJava;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaDslPackage getSmallJavaDslPackage()
  {
    return (SmallJavaDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmallJavaDslPackage getPackage()
  {
    return SmallJavaDslPackage.eINSTANCE;
  }

} //SmallJavaDslFactoryImpl
