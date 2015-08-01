/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Small Java</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getName <em>Name</em>}</li>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getParent <em>Parent</em>}</li>
 *   <li>{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage#getSmallJava()
 * @model
 * @generated
 */
public interface SmallJava extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage#getSmallJava_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(SmallJava)
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage#getSmallJava_Parent()
   * @model
   * @generated
   */
  SmallJava getParent();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(SmallJava value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(Attribute)
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslPackage#getSmallJava_Attribute()
   * @model containment="true"
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // SmallJava
