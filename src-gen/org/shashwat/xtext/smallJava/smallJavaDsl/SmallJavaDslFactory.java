/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage
 * @generated
 */
public interface SmallJavaDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmallJavaDslFactory eINSTANCE = org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace</em>'.
   * @generated
   */
  Namespace createNamespace();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Small Java</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Small Java</em>'.
   * @generated
   */
  SmallJava createSmallJava();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype</em>'.
   * @generated
   */
  Datatype createDatatype();

  /**
   * Returns a new object of class '<em>Small Java Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Small Java Type</em>'.
   * @generated
   */
  SmallJavaType createSmallJavaType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SmallJavaDslPackage getSmallJavaDslPackage();

} //SmallJavaDslFactory
