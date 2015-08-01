/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaDslFactory
 * @model kind="package"
 * @generated
 */
public interface SmallJavaDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smallJavaDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.shashwat.org/xtext/smallJava/SmallJavaDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smallJavaDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmallJavaDslPackage eINSTANCE = org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl <em>Small Java</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getSmallJava()
   * @generated
   */
  int SMALL_JAVA = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__NAME = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__PARENT = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Small Java</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.AttributeImpl
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DATATYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava <em>Small Java</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Small Java</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava
   * @generated
   */
  EClass getSmallJava();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getName()
   * @see #getSmallJava()
   * @generated
   */
  EAttribute getSmallJava_Name();

  /**
   * Returns the meta object for the reference '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getParent()
   * @see #getSmallJava()
   * @generated
   */
  EReference getSmallJava_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getAttribute()
   * @see #getSmallJava()
   * @generated
   */
  EReference getSmallJava_Attribute();

  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datatype</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#getDatatype()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Datatype();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmallJavaDslFactory getSmallJavaDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl <em>Small Java</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getSmallJava()
     * @generated
     */
    EClass SMALL_JAVA = eINSTANCE.getSmallJava();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMALL_JAVA__NAME = eINSTANCE.getSmallJava_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_JAVA__PARENT = eINSTANCE.getSmallJava_Parent();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_JAVA__ATTRIBUTE = eINSTANCE.getSmallJava_Attribute();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.AttributeImpl
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

  }

} //SmallJavaDslPackage
