/**
 */
package simpleWeb;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simpleWeb.SimpleWebFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleWebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleWeb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simpleWeb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleWeb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleWebPackage eINSTANCE = simpleWeb.impl.SimpleWebPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleWeb.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.ParagrapheImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.ButtonImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 5;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.PageImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 6;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.SectionImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.ImageImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 4;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.LienImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__PAGE = 1;

	/**
	 * The feature id for the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__PARAGRAPHE = 2;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.TextImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Paragraphe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARAGRAPHE = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LIEN = 4;

	/**
	 * The feature id for the '<em><b>Lienexterne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LIENEXTERNE = 5;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SECTION = 6;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRC = 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PARAGRAPHE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PAGE = 2;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.SiteWebImpl <em>Site Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.SiteWebImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getSiteWeb()
	 * @generated
	 */
	int SITE_WEB = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WEB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WEB__PAGE = 1;

	/**
	 * The number of structural features of the '<em>Site Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WEB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_WEB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleWeb.impl.LienExterneImpl <em>Lien Externe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleWeb.impl.LienExterneImpl
	 * @see simpleWeb.impl.SimpleWebPackageImpl#getLienExterne()
	 * @generated
	 */
	int LIEN_EXTERNE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Siteweb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE__SITEWEB = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE__URL = 2;

	/**
	 * The number of structural features of the '<em>Lien Externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lien Externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_EXTERNE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link simpleWeb.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see simpleWeb.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Paragraphe#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see simpleWeb.Paragraphe#getText()
	 * @see #getParagraphe()
	 * @generated
	 */
	EReference getParagraphe_Text();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Paragraphe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.Paragraphe#getName()
	 * @see #getParagraphe()
	 * @generated
	 */
	EAttribute getParagraphe_Name();

	/**
	 * Returns the meta object for class '{@link simpleWeb.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see simpleWeb.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link simpleWeb.Button#getParagraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragraphe</em>'.
	 * @see simpleWeb.Button#getParagraphe()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Paragraphe();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Button#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.Button#getName()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Name();

	/**
	 * Returns the meta object for the reference '{@link simpleWeb.Button#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see simpleWeb.Button#getPage()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Page();

	/**
	 * Returns the meta object for class '{@link simpleWeb.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see simpleWeb.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Page#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see simpleWeb.Page#getSection()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Section();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link simpleWeb.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see simpleWeb.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Section#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.Section#getName()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Section#getParagraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphe</em>'.
	 * @see simpleWeb.Section#getParagraphe()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Paragraphe();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Section#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see simpleWeb.Section#getImage()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Section#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lien</em>'.
	 * @see simpleWeb.Section#getLien()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Lien();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Section#getLienexterne <em>Lienexterne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lienexterne</em>'.
	 * @see simpleWeb.Section#getLienexterne()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Lienexterne();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Section#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see simpleWeb.Section#getSection()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Section();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.Section#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Button</em>'.
	 * @see simpleWeb.Section#getButton()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Button();

	/**
	 * Returns the meta object for class '{@link simpleWeb.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see simpleWeb.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Image#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see simpleWeb.Image#getSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Src();

	/**
	 * Returns the meta object for class '{@link simpleWeb.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see simpleWeb.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Lien#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.Lien#getName()
	 * @see #getLien()
	 * @generated
	 */
	EAttribute getLien_Name();

	/**
	 * Returns the meta object for the reference '{@link simpleWeb.Lien#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see simpleWeb.Lien#getPage()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Page();

	/**
	 * Returns the meta object for the reference '{@link simpleWeb.Lien#getParagraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragraphe</em>'.
	 * @see simpleWeb.Lien#getParagraphe()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Paragraphe();

	/**
	 * Returns the meta object for class '{@link simpleWeb.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see simpleWeb.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Text#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.Text#getName()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see simpleWeb.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Content();

	/**
	 * Returns the meta object for class '{@link simpleWeb.SiteWeb <em>Site Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Web</em>'.
	 * @see simpleWeb.SiteWeb
	 * @generated
	 */
	EClass getSiteWeb();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.SiteWeb#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.SiteWeb#getName()
	 * @see #getSiteWeb()
	 * @generated
	 */
	EAttribute getSiteWeb_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleWeb.SiteWeb#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see simpleWeb.SiteWeb#getPage()
	 * @see #getSiteWeb()
	 * @generated
	 */
	EReference getSiteWeb_Page();

	/**
	 * Returns the meta object for class '{@link simpleWeb.LienExterne <em>Lien Externe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Externe</em>'.
	 * @see simpleWeb.LienExterne
	 * @generated
	 */
	EClass getLienExterne();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.LienExterne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleWeb.LienExterne#getName()
	 * @see #getLienExterne()
	 * @generated
	 */
	EAttribute getLienExterne_Name();

	/**
	 * Returns the meta object for the reference '{@link simpleWeb.LienExterne#getSiteweb <em>Siteweb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Siteweb</em>'.
	 * @see simpleWeb.LienExterne#getSiteweb()
	 * @see #getLienExterne()
	 * @generated
	 */
	EReference getLienExterne_Siteweb();

	/**
	 * Returns the meta object for the attribute '{@link simpleWeb.LienExterne#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see simpleWeb.LienExterne#getUrl()
	 * @see #getLienExterne()
	 * @generated
	 */
	EAttribute getLienExterne_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleWebFactory getSimpleWebFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simpleWeb.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.ParagrapheImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPHE__TEXT = eINSTANCE.getParagraphe_Text();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPHE__NAME = eINSTANCE.getParagraphe_Name();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.ButtonImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Paragraphe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__PARAGRAPHE = eINSTANCE.getButton_Paragraphe();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__NAME = eINSTANCE.getButton_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__PAGE = eINSTANCE.getButton_Page();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.PageImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SECTION = eINSTANCE.getPage_Section();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.SectionImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

		/**
		 * The meta object literal for the '<em><b>Paragraphe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARAGRAPHE = eINSTANCE.getSection_Paragraphe();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__IMAGE = eINSTANCE.getSection_Image();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__LIEN = eINSTANCE.getSection_Lien();

		/**
		 * The meta object literal for the '<em><b>Lienexterne</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__LIENEXTERNE = eINSTANCE.getSection_Lienexterne();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SECTION = eINSTANCE.getSection_Section();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__BUTTON = eINSTANCE.getSection_Button();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.ImageImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SRC = eINSTANCE.getImage_Src();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.LienImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN__NAME = eINSTANCE.getLien_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__PAGE = eINSTANCE.getLien_Page();

		/**
		 * The meta object literal for the '<em><b>Paragraphe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__PARAGRAPHE = eINSTANCE.getLien_Paragraphe();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.TextImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__NAME = eINSTANCE.getText_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__CONTENT = eINSTANCE.getText_Content();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.SiteWebImpl <em>Site Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.SiteWebImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getSiteWeb()
		 * @generated
		 */
		EClass SITE_WEB = eINSTANCE.getSiteWeb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_WEB__NAME = eINSTANCE.getSiteWeb_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_WEB__PAGE = eINSTANCE.getSiteWeb_Page();

		/**
		 * The meta object literal for the '{@link simpleWeb.impl.LienExterneImpl <em>Lien Externe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleWeb.impl.LienExterneImpl
		 * @see simpleWeb.impl.SimpleWebPackageImpl#getLienExterne()
		 * @generated
		 */
		EClass LIEN_EXTERNE = eINSTANCE.getLienExterne();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN_EXTERNE__NAME = eINSTANCE.getLienExterne_Name();

		/**
		 * The meta object literal for the '<em><b>Siteweb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN_EXTERNE__SITEWEB = eINSTANCE.getLienExterne_Siteweb();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN_EXTERNE__URL = eINSTANCE.getLienExterne_Url();

	}

} //SimpleWebPackage
