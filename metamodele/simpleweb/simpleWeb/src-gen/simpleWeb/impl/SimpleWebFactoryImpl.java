/**
 */
package simpleWeb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleWeb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleWebFactoryImpl extends EFactoryImpl implements SimpleWebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleWebFactory init() {
		try {
			SimpleWebFactory theSimpleWebFactory = (SimpleWebFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimpleWebPackage.eNS_URI);
			if (theSimpleWebFactory != null) {
				return theSimpleWebFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleWebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleWebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SimpleWebPackage.PARAGRAPHE:
			return createParagraphe();
		case SimpleWebPackage.LIEN:
			return createLien();
		case SimpleWebPackage.TEXT:
			return createText();
		case SimpleWebPackage.SECTION:
			return createSection();
		case SimpleWebPackage.IMAGE:
			return createImage();
		case SimpleWebPackage.BUTTON:
			return createButton();
		case SimpleWebPackage.PAGE:
			return createPage();
		case SimpleWebPackage.SITE_WEB:
			return createSiteWeb();
		case SimpleWebPackage.LIEN_EXTERNE:
			return createLienExterne();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe createParagraphe() {
		ParagrapheImpl paragraphe = new ParagrapheImpl();
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lien createLien() {
		LienImpl lien = new LienImpl();
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWeb createSiteWeb() {
		SiteWebImpl siteWeb = new SiteWebImpl();
		return siteWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienExterne createLienExterne() {
		LienExterneImpl lienExterne = new LienExterneImpl();
		return lienExterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleWebPackage getSimpleWebPackage() {
		return (SimpleWebPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleWebPackage getPackage() {
		return SimpleWebPackage.eINSTANCE;
	}

} //SimpleWebFactoryImpl
