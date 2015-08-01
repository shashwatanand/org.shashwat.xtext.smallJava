/**
 */
package org.shashwat.xtext.smallJava.smallJavaDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.NamespaceImpl
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Small Java</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__SMALL_JAVA = 1;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl <em>Small Java</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaImpl
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getSmallJava()
   * @generated
   */
  int SMALL_JAVA = 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__VISIBILITY = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__FINAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__NAME = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__PARENT = 3;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA__ATTRIBUTE = 4;

  /**
   * The number of structural features of the '<em>Small Java</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.AttributeImpl
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DATATYPE = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ARRAY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.DatatypeImpl
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 3;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaTypeImpl <em>Small Java Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaTypeImpl
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getSmallJavaType()
   * @generated
   */
  int SMALL_JAVA_TYPE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA_TYPE__TYPE = DATATYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Small Java Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_JAVA_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.VisibilityTypes <em>Visibility Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.VisibilityTypes
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getVisibilityTypes()
   * @generated
   */
  int VISIBILITY_TYPES = 5;


  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Namespace#getSmallJava <em>Small Java</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Small Java</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Namespace#getSmallJava()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_SmallJava();

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
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#getVisibility()
   * @see #getSmallJava()
   * @generated
   */
  EAttribute getSmallJava_Visibility();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJava#isFinal()
   * @see #getSmallJava()
   * @generated
   */
  EAttribute getSmallJava_Final();

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
   * Returns the meta object for the containment reference '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#getDatatype()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Datatype();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Attribute#isArray()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Array();

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
   * Returns the meta object for class '{@link org.shashwat.xtext.smallJava.smallJavaDsl.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaType <em>Small Java Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Small Java Type</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaType
   * @generated
   */
  EClass getSmallJavaType();

  /**
   * Returns the meta object for the reference '{@link org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.SmallJavaType#getType()
   * @see #getSmallJavaType()
   * @generated
   */
  EReference getSmallJavaType_Type();

  /**
   * Returns the meta object for enum '{@link org.shashwat.xtext.smallJava.smallJavaDsl.VisibilityTypes <em>Visibility Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility Types</em>'.
   * @see org.shashwat.xtext.smallJava.smallJavaDsl.VisibilityTypes
   * @generated
   */
  EEnum getVisibilityTypes();

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
     * The meta object literal for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.NamespaceImpl
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

    /**
     * The meta object literal for the '<em><b>Small Java</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__SMALL_JAVA = eINSTANCE.getNamespace_SmallJava();

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
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMALL_JAVA__VISIBILITY = eINSTANCE.getSmallJava_Visibility();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMALL_JAVA__FINAL = eINSTANCE.getSmallJava_Final();

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
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ARRAY = eINSTANCE.getAttribute_Array();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.DatatypeImpl
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaTypeImpl <em>Small Java Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaTypeImpl
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getSmallJavaType()
     * @generated
     */
    EClass SMALL_JAVA_TYPE = eINSTANCE.getSmallJavaType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_JAVA_TYPE__TYPE = eINSTANCE.getSmallJavaType_Type();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.smallJava.smallJavaDsl.VisibilityTypes <em>Visibility Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.VisibilityTypes
     * @see org.shashwat.xtext.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getVisibilityTypes()
     * @generated
     */
    EEnum VISIBILITY_TYPES = eINSTANCE.getVisibilityTypes();

  }

} //SmallJavaDslPackage
