/**
 */
package dSLMobility;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dSLMobility.DSLMobilityFactory
 * @model kind="package"
 * @generated
 */
public interface DSLMobilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dSLMobility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dSLMobility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dSLMobility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSLMobilityPackage eINSTANCE = dSLMobility.impl.DSLMobilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link dSLMobility.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dSLMobility.impl.PageImpl
	 * @see dSLMobility.impl.DSLMobilityPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MAIL = 3;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TELEPHONE = 4;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MENU = 5;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PRESENTATION = 6;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LOGO = 7;

	/**
	 * The feature id for the '<em><b>Geolocalisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GEOLOCALISATION = 8;

	/**
	 * The feature id for the '<em><b>Heure ouverture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEURE_OUVERTURE = 9;

	/**
	 * The feature id for the '<em><b>Heure fermeture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HEURE_FERMETURE = 10;

	/**
	 * The feature id for the '<em><b>Nb Pers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NB_PERS = 11;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dSLMobility.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dSLMobility.impl.SourceImpl
	 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dSLMobility.SourceName <em>Source Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dSLMobility.SourceName
	 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourceName()
	 * @generated
	 */
	int SOURCE_NAME = 2;

	/**
	 * The meta object id for the '{@link dSLMobility.SourceMenu <em>Source Menu</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dSLMobility.SourceMenu
	 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourceMenu()
	 * @generated
	 */
	int SOURCE_MENU = 3;

	/**
	 * The meta object id for the '{@link dSLMobility.SourcePres <em>Source Pres</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dSLMobility.SourcePres
	 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourcePres()
	 * @generated
	 */
	int SOURCE_PRES = 4;

	/**
	 * The meta object id for the '{@link dSLMobility.SourceLogo <em>Source Logo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dSLMobility.SourceLogo
	 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourceLogo()
	 * @generated
	 */
	int SOURCE_LOGO = 5;

	/**
	 * Returns the meta object for class '{@link dSLMobility.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see dSLMobility.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dSLMobility.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dSLMobility.Page#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see dSLMobility.Page#getSource()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Source();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dSLMobility.Page#getDescription()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Description();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see dSLMobility.Page#getMail()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Mail();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see dSLMobility.Page#getTelephone()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu</em>'.
	 * @see dSLMobility.Page#getMenu()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Menu();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see dSLMobility.Page#getPresentation()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Presentation();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see dSLMobility.Page#getLogo()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Logo();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getGeolocalisation <em>Geolocalisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geolocalisation</em>'.
	 * @see dSLMobility.Page#getGeolocalisation()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Geolocalisation();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getHeure_ouverture <em>Heure ouverture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure ouverture</em>'.
	 * @see dSLMobility.Page#getHeure_ouverture()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Heure_ouverture();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getHeure_fermeture <em>Heure fermeture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure fermeture</em>'.
	 * @see dSLMobility.Page#getHeure_fermeture()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Heure_fermeture();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Page#getNb_Pers <em>Nb Pers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Pers</em>'.
	 * @see dSLMobility.Page#getNb_Pers()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Nb_Pers();

	/**
	 * Returns the meta object for class '{@link dSLMobility.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see dSLMobility.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link dSLMobility.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dSLMobility.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for enum '{@link dSLMobility.SourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Name</em>'.
	 * @see dSLMobility.SourceName
	 * @generated
	 */
	EEnum getSourceName();

	/**
	 * Returns the meta object for enum '{@link dSLMobility.SourceMenu <em>Source Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Menu</em>'.
	 * @see dSLMobility.SourceMenu
	 * @generated
	 */
	EEnum getSourceMenu();

	/**
	 * Returns the meta object for enum '{@link dSLMobility.SourcePres <em>Source Pres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Pres</em>'.
	 * @see dSLMobility.SourcePres
	 * @generated
	 */
	EEnum getSourcePres();

	/**
	 * Returns the meta object for enum '{@link dSLMobility.SourceLogo <em>Source Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Logo</em>'.
	 * @see dSLMobility.SourceLogo
	 * @generated
	 */
	EEnum getSourceLogo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DSLMobilityFactory getDSLMobilityFactory();

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
		 * The meta object literal for the '{@link dSLMobility.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dSLMobility.impl.PageImpl
		 * @see dSLMobility.impl.DSLMobilityPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SOURCE = eINSTANCE.getPage_Source();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DESCRIPTION = eINSTANCE.getPage_Description();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__MAIL = eINSTANCE.getPage_Mail();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TELEPHONE = eINSTANCE.getPage_Telephone();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__MENU = eINSTANCE.getPage_Menu();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PRESENTATION = eINSTANCE.getPage_Presentation();

		/**
		 * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__LOGO = eINSTANCE.getPage_Logo();

		/**
		 * The meta object literal for the '<em><b>Geolocalisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__GEOLOCALISATION = eINSTANCE.getPage_Geolocalisation();

		/**
		 * The meta object literal for the '<em><b>Heure ouverture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__HEURE_OUVERTURE = eINSTANCE.getPage_Heure_ouverture();

		/**
		 * The meta object literal for the '<em><b>Heure fermeture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__HEURE_FERMETURE = eINSTANCE.getPage_Heure_fermeture();

		/**
		 * The meta object literal for the '<em><b>Nb Pers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NB_PERS = eINSTANCE.getPage_Nb_Pers();

		/**
		 * The meta object literal for the '{@link dSLMobility.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dSLMobility.impl.SourceImpl
		 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

		/**
		 * The meta object literal for the '{@link dSLMobility.SourceName <em>Source Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dSLMobility.SourceName
		 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourceName()
		 * @generated
		 */
		EEnum SOURCE_NAME = eINSTANCE.getSourceName();

		/**
		 * The meta object literal for the '{@link dSLMobility.SourceMenu <em>Source Menu</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dSLMobility.SourceMenu
		 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourceMenu()
		 * @generated
		 */
		EEnum SOURCE_MENU = eINSTANCE.getSourceMenu();

		/**
		 * The meta object literal for the '{@link dSLMobility.SourcePres <em>Source Pres</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dSLMobility.SourcePres
		 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourcePres()
		 * @generated
		 */
		EEnum SOURCE_PRES = eINSTANCE.getSourcePres();

		/**
		 * The meta object literal for the '{@link dSLMobility.SourceLogo <em>Source Logo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dSLMobility.SourceLogo
		 * @see dSLMobility.impl.DSLMobilityPackageImpl#getSourceLogo()
		 * @generated
		 */
		EEnum SOURCE_LOGO = eINSTANCE.getSourceLogo();

	}

} //DSLMobilityPackage
