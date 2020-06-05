package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'geolocalisation'", "'Page'", "'description'", "'mail'", "'telephone'", "'heure_ouverture'", "'heure_fermeture'", "'nb_Pers'", "'menu'", "'Selection'", "'presentation'", "'logo'", "'source'", "','", "'Port_back'", "'Port_front'", "'-'", "'SideBar'", "'NavBar'", "'Planning'", "'RDV'", "'basique'", "'card'", "'comute'", "'rdv'", "'trajet'", "'Tisseo'", "'GoogleMap'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Page";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePage"
    // InternalMyDsl.g:65:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalMyDsl.g:65:45: (iv_rulePage= rulePage EOF )
            // InternalMyDsl.g:66:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalMyDsl.g:72:1: rulePage returns [EObject current=null] : ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEInt ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEInt ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEInt ) ) otherlv_15= 'menu' ( (lv_menu_16_0= ruleSourceMenu ) ) otherlv_17= 'Selection' ( (lv_Selection_18_0= ruleSourceSelection ) ) otherlv_19= 'presentation' ( (lv_presentation_20_0= ruleSourcePres ) ) otherlv_21= 'logo' ( (lv_logo_22_0= ruleSourceLogo ) ) otherlv_23= 'source' ( (lv_source_24_0= ruleSource ) ) (otherlv_25= ',' ( (lv_source_26_0= ruleSource ) ) )* (otherlv_27= 'Port_back' ( (lv_Port_back_28_0= ruleEInt ) ) )? (otherlv_29= 'Port_front' ( (lv_Port_front_30_0= ruleEInt ) ) )? ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_geolocalisation_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_mail_6_0 = null;

        AntlrDatatypeRuleToken lv_telephone_8_0 = null;

        AntlrDatatypeRuleToken lv_heure_ouverture_10_0 = null;

        AntlrDatatypeRuleToken lv_heure_fermeture_12_0 = null;

        AntlrDatatypeRuleToken lv_nb_Pers_14_0 = null;

        Enumerator lv_menu_16_0 = null;

        Enumerator lv_Selection_18_0 = null;

        Enumerator lv_presentation_20_0 = null;

        Enumerator lv_logo_22_0 = null;

        EObject lv_source_24_0 = null;

        EObject lv_source_26_0 = null;

        AntlrDatatypeRuleToken lv_Port_back_28_0 = null;

        AntlrDatatypeRuleToken lv_Port_front_30_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEInt ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEInt ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEInt ) ) otherlv_15= 'menu' ( (lv_menu_16_0= ruleSourceMenu ) ) otherlv_17= 'Selection' ( (lv_Selection_18_0= ruleSourceSelection ) ) otherlv_19= 'presentation' ( (lv_presentation_20_0= ruleSourcePres ) ) otherlv_21= 'logo' ( (lv_logo_22_0= ruleSourceLogo ) ) otherlv_23= 'source' ( (lv_source_24_0= ruleSource ) ) (otherlv_25= ',' ( (lv_source_26_0= ruleSource ) ) )* (otherlv_27= 'Port_back' ( (lv_Port_back_28_0= ruleEInt ) ) )? (otherlv_29= 'Port_front' ( (lv_Port_front_30_0= ruleEInt ) ) )? ) )
            // InternalMyDsl.g:79:2: ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEInt ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEInt ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEInt ) ) otherlv_15= 'menu' ( (lv_menu_16_0= ruleSourceMenu ) ) otherlv_17= 'Selection' ( (lv_Selection_18_0= ruleSourceSelection ) ) otherlv_19= 'presentation' ( (lv_presentation_20_0= ruleSourcePres ) ) otherlv_21= 'logo' ( (lv_logo_22_0= ruleSourceLogo ) ) otherlv_23= 'source' ( (lv_source_24_0= ruleSource ) ) (otherlv_25= ',' ( (lv_source_26_0= ruleSource ) ) )* (otherlv_27= 'Port_back' ( (lv_Port_back_28_0= ruleEInt ) ) )? (otherlv_29= 'Port_front' ( (lv_Port_front_30_0= ruleEInt ) ) )? )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEInt ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEInt ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEInt ) ) otherlv_15= 'menu' ( (lv_menu_16_0= ruleSourceMenu ) ) otherlv_17= 'Selection' ( (lv_Selection_18_0= ruleSourceSelection ) ) otherlv_19= 'presentation' ( (lv_presentation_20_0= ruleSourcePres ) ) otherlv_21= 'logo' ( (lv_logo_22_0= ruleSourceLogo ) ) otherlv_23= 'source' ( (lv_source_24_0= ruleSource ) ) (otherlv_25= ',' ( (lv_source_26_0= ruleSource ) ) )* (otherlv_27= 'Port_back' ( (lv_Port_back_28_0= ruleEInt ) ) )? (otherlv_29= 'Port_front' ( (lv_Port_front_30_0= ruleEInt ) ) )? )
            // InternalMyDsl.g:80:3: ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEInt ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEInt ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEInt ) ) otherlv_15= 'menu' ( (lv_menu_16_0= ruleSourceMenu ) ) otherlv_17= 'Selection' ( (lv_Selection_18_0= ruleSourceSelection ) ) otherlv_19= 'presentation' ( (lv_presentation_20_0= ruleSourcePres ) ) otherlv_21= 'logo' ( (lv_logo_22_0= ruleSourceLogo ) ) otherlv_23= 'source' ( (lv_source_24_0= ruleSource ) ) (otherlv_25= ',' ( (lv_source_26_0= ruleSource ) ) )* (otherlv_27= 'Port_back' ( (lv_Port_back_28_0= ruleEInt ) ) )? (otherlv_29= 'Port_front' ( (lv_Port_front_30_0= ruleEInt ) ) )?
            {
            // InternalMyDsl.g:80:3: ( (lv_geolocalisation_0_0= 'geolocalisation' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:81:4: (lv_geolocalisation_0_0= 'geolocalisation' )
                    {
                    // InternalMyDsl.g:81:4: (lv_geolocalisation_0_0= 'geolocalisation' )
                    // InternalMyDsl.g:82:5: lv_geolocalisation_0_0= 'geolocalisation'
                    {
                    lv_geolocalisation_0_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_geolocalisation_0_0, grammarAccess.getPageAccess().getGeolocalisationGeolocalisationKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPageRule());
                    					}
                    					setWithLastConsumed(current, "geolocalisation", true, "geolocalisation");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
            		
            // InternalMyDsl.g:98:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:99:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:99:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:100:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPageAccess().getDescriptionKeyword_3());
            		
            // InternalMyDsl.g:121:3: ( (lv_description_4_0= ruleEString ) )
            // InternalMyDsl.g:122:4: (lv_description_4_0= ruleEString )
            {
            // InternalMyDsl.g:122:4: (lv_description_4_0= ruleEString )
            // InternalMyDsl.g:123:5: lv_description_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getDescriptionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_description_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPageAccess().getMailKeyword_5());
            		
            // InternalMyDsl.g:144:3: ( (lv_mail_6_0= ruleEString ) )
            // InternalMyDsl.g:145:4: (lv_mail_6_0= ruleEString )
            {
            // InternalMyDsl.g:145:4: (lv_mail_6_0= ruleEString )
            // InternalMyDsl.g:146:5: lv_mail_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getMailEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_mail_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"mail",
            						lv_mail_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPageAccess().getTelephoneKeyword_7());
            		
            // InternalMyDsl.g:167:3: ( (lv_telephone_8_0= ruleEString ) )
            // InternalMyDsl.g:168:4: (lv_telephone_8_0= ruleEString )
            {
            // InternalMyDsl.g:168:4: (lv_telephone_8_0= ruleEString )
            // InternalMyDsl.g:169:5: lv_telephone_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getTelephoneEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_telephone_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"telephone",
            						lv_telephone_8_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getPageAccess().getHeure_ouvertureKeyword_9());
            		
            // InternalMyDsl.g:190:3: ( (lv_heure_ouverture_10_0= ruleEInt ) )
            // InternalMyDsl.g:191:4: (lv_heure_ouverture_10_0= ruleEInt )
            {
            // InternalMyDsl.g:191:4: (lv_heure_ouverture_10_0= ruleEInt )
            // InternalMyDsl.g:192:5: lv_heure_ouverture_10_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPageAccess().getHeure_ouvertureEIntParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_heure_ouverture_10_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"heure_ouverture",
            						lv_heure_ouverture_10_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getPageAccess().getHeure_fermetureKeyword_11());
            		
            // InternalMyDsl.g:213:3: ( (lv_heure_fermeture_12_0= ruleEInt ) )
            // InternalMyDsl.g:214:4: (lv_heure_fermeture_12_0= ruleEInt )
            {
            // InternalMyDsl.g:214:4: (lv_heure_fermeture_12_0= ruleEInt )
            // InternalMyDsl.g:215:5: lv_heure_fermeture_12_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPageAccess().getHeure_fermetureEIntParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_heure_fermeture_12_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"heure_fermeture",
            						lv_heure_fermeture_12_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getPageAccess().getNb_PersKeyword_13());
            		
            // InternalMyDsl.g:236:3: ( (lv_nb_Pers_14_0= ruleEInt ) )
            // InternalMyDsl.g:237:4: (lv_nb_Pers_14_0= ruleEInt )
            {
            // InternalMyDsl.g:237:4: (lv_nb_Pers_14_0= ruleEInt )
            // InternalMyDsl.g:238:5: lv_nb_Pers_14_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPageAccess().getNb_PersEIntParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_12);
            lv_nb_Pers_14_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"nb_Pers",
            						lv_nb_Pers_14_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getPageAccess().getMenuKeyword_15());
            		
            // InternalMyDsl.g:259:3: ( (lv_menu_16_0= ruleSourceMenu ) )
            // InternalMyDsl.g:260:4: (lv_menu_16_0= ruleSourceMenu )
            {
            // InternalMyDsl.g:260:4: (lv_menu_16_0= ruleSourceMenu )
            // InternalMyDsl.g:261:5: lv_menu_16_0= ruleSourceMenu
            {

            					newCompositeNode(grammarAccess.getPageAccess().getMenuSourceMenuEnumRuleCall_16_0());
            				
            pushFollow(FOLLOW_14);
            lv_menu_16_0=ruleSourceMenu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"menu",
            						lv_menu_16_0,
            						"org.xtext.example.mydsl.MyDsl.SourceMenu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getPageAccess().getSelectionKeyword_17());
            		
            // InternalMyDsl.g:282:3: ( (lv_Selection_18_0= ruleSourceSelection ) )
            // InternalMyDsl.g:283:4: (lv_Selection_18_0= ruleSourceSelection )
            {
            // InternalMyDsl.g:283:4: (lv_Selection_18_0= ruleSourceSelection )
            // InternalMyDsl.g:284:5: lv_Selection_18_0= ruleSourceSelection
            {

            					newCompositeNode(grammarAccess.getPageAccess().getSelectionSourceSelectionEnumRuleCall_18_0());
            				
            pushFollow(FOLLOW_16);
            lv_Selection_18_0=ruleSourceSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"Selection",
            						lv_Selection_18_0,
            						"org.xtext.example.mydsl.MyDsl.SourceSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_19, grammarAccess.getPageAccess().getPresentationKeyword_19());
            		
            // InternalMyDsl.g:305:3: ( (lv_presentation_20_0= ruleSourcePres ) )
            // InternalMyDsl.g:306:4: (lv_presentation_20_0= ruleSourcePres )
            {
            // InternalMyDsl.g:306:4: (lv_presentation_20_0= ruleSourcePres )
            // InternalMyDsl.g:307:5: lv_presentation_20_0= ruleSourcePres
            {

            					newCompositeNode(grammarAccess.getPageAccess().getPresentationSourcePresEnumRuleCall_20_0());
            				
            pushFollow(FOLLOW_18);
            lv_presentation_20_0=ruleSourcePres();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"presentation",
            						lv_presentation_20_0,
            						"org.xtext.example.mydsl.MyDsl.SourcePres");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getPageAccess().getLogoKeyword_21());
            		
            // InternalMyDsl.g:328:3: ( (lv_logo_22_0= ruleSourceLogo ) )
            // InternalMyDsl.g:329:4: (lv_logo_22_0= ruleSourceLogo )
            {
            // InternalMyDsl.g:329:4: (lv_logo_22_0= ruleSourceLogo )
            // InternalMyDsl.g:330:5: lv_logo_22_0= ruleSourceLogo
            {

            					newCompositeNode(grammarAccess.getPageAccess().getLogoSourceLogoEnumRuleCall_22_0());
            				
            pushFollow(FOLLOW_20);
            lv_logo_22_0=ruleSourceLogo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"logo",
            						lv_logo_22_0,
            						"org.xtext.example.mydsl.MyDsl.SourceLogo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_23, grammarAccess.getPageAccess().getSourceKeyword_23());
            		
            // InternalMyDsl.g:351:3: ( (lv_source_24_0= ruleSource ) )
            // InternalMyDsl.g:352:4: (lv_source_24_0= ruleSource )
            {
            // InternalMyDsl.g:352:4: (lv_source_24_0= ruleSource )
            // InternalMyDsl.g:353:5: lv_source_24_0= ruleSource
            {

            					newCompositeNode(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_22);
            lv_source_24_0=ruleSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					add(
            						current,
            						"source",
            						lv_source_24_0,
            						"org.xtext.example.mydsl.MyDsl.Source");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:370:3: (otherlv_25= ',' ( (lv_source_26_0= ruleSource ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:371:4: otherlv_25= ',' ( (lv_source_26_0= ruleSource ) )
            	    {
            	    otherlv_25=(Token)match(input,24,FOLLOW_21); 

            	    				newLeafNode(otherlv_25, grammarAccess.getPageAccess().getCommaKeyword_25_0());
            	    			
            	    // InternalMyDsl.g:375:4: ( (lv_source_26_0= ruleSource ) )
            	    // InternalMyDsl.g:376:5: (lv_source_26_0= ruleSource )
            	    {
            	    // InternalMyDsl.g:376:5: (lv_source_26_0= ruleSource )
            	    // InternalMyDsl.g:377:6: lv_source_26_0= ruleSource
            	    {

            	    						newCompositeNode(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_25_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_source_26_0=ruleSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"source",
            	    							lv_source_26_0,
            	    							"org.xtext.example.mydsl.MyDsl.Source");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:395:3: (otherlv_27= 'Port_back' ( (lv_Port_back_28_0= ruleEInt ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:396:4: otherlv_27= 'Port_back' ( (lv_Port_back_28_0= ruleEInt ) )
                    {
                    otherlv_27=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_27, grammarAccess.getPageAccess().getPort_backKeyword_26_0());
                    			
                    // InternalMyDsl.g:400:4: ( (lv_Port_back_28_0= ruleEInt ) )
                    // InternalMyDsl.g:401:5: (lv_Port_back_28_0= ruleEInt )
                    {
                    // InternalMyDsl.g:401:5: (lv_Port_back_28_0= ruleEInt )
                    // InternalMyDsl.g:402:6: lv_Port_back_28_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getPort_backEIntParserRuleCall_26_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_Port_back_28_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						set(
                    							current,
                    							"Port_back",
                    							lv_Port_back_28_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:420:3: (otherlv_29= 'Port_front' ( (lv_Port_front_30_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:421:4: otherlv_29= 'Port_front' ( (lv_Port_front_30_0= ruleEInt ) )
                    {
                    otherlv_29=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_29, grammarAccess.getPageAccess().getPort_frontKeyword_27_0());
                    			
                    // InternalMyDsl.g:425:4: ( (lv_Port_front_30_0= ruleEInt ) )
                    // InternalMyDsl.g:426:5: (lv_Port_front_30_0= ruleEInt )
                    {
                    // InternalMyDsl.g:426:5: (lv_Port_front_30_0= ruleEInt )
                    // InternalMyDsl.g:427:6: lv_Port_front_30_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getPort_frontEIntParserRuleCall_27_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Port_front_30_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						set(
                    							current,
                    							"Port_front",
                    							lv_Port_front_30_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:449:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:449:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:450:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:456:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:462:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:463:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:463:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:464:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:472:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSource"
    // InternalMyDsl.g:483:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalMyDsl.g:483:47: (iv_ruleSource= ruleSource EOF )
            // InternalMyDsl.g:484:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalMyDsl.g:490:1: ruleSource returns [EObject current=null] : ( () ( (lv_name_1_0= ruleSourceName ) )? ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:496:2: ( ( () ( (lv_name_1_0= ruleSourceName ) )? ) )
            // InternalMyDsl.g:497:2: ( () ( (lv_name_1_0= ruleSourceName ) )? )
            {
            // InternalMyDsl.g:497:2: ( () ( (lv_name_1_0= ruleSourceName ) )? )
            // InternalMyDsl.g:498:3: () ( (lv_name_1_0= ruleSourceName ) )?
            {
            // InternalMyDsl.g:498:3: ()
            // InternalMyDsl.g:499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceAccess().getSourceAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:505:3: ( (lv_name_1_0= ruleSourceName ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=37 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:506:4: (lv_name_1_0= ruleSourceName )
                    {
                    // InternalMyDsl.g:506:4: (lv_name_1_0= ruleSourceName )
                    // InternalMyDsl.g:507:5: lv_name_1_0= ruleSourceName
                    {

                    					newCompositeNode(grammarAccess.getSourceAccess().getNameSourceNameEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleSourceName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSourceRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.xtext.example.mydsl.MyDsl.SourceName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:528:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:528:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:529:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:535:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:541:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:542:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:542:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:543:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:543:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:544:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSourceMenu"
    // InternalMyDsl.g:561:1: ruleSourceMenu returns [Enumerator current=null] : ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) ) ;
    public final Enumerator ruleSourceMenu() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:567:2: ( ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) ) )
            // InternalMyDsl.g:568:2: ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) )
            {
            // InternalMyDsl.g:568:2: ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:569:3: (enumLiteral_0= 'SideBar' )
                    {
                    // InternalMyDsl.g:569:3: (enumLiteral_0= 'SideBar' )
                    // InternalMyDsl.g:570:4: enumLiteral_0= 'SideBar'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:577:3: (enumLiteral_1= 'NavBar' )
                    {
                    // InternalMyDsl.g:577:3: (enumLiteral_1= 'NavBar' )
                    // InternalMyDsl.g:578:4: enumLiteral_1= 'NavBar'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getSourceMenuAccess().getNavBarEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSourceMenuAccess().getNavBarEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceMenu"


    // $ANTLR start "ruleSourceSelection"
    // InternalMyDsl.g:588:1: ruleSourceSelection returns [Enumerator current=null] : ( (enumLiteral_0= 'Planning' ) | (enumLiteral_1= 'RDV' ) ) ;
    public final Enumerator ruleSourceSelection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:594:2: ( ( (enumLiteral_0= 'Planning' ) | (enumLiteral_1= 'RDV' ) ) )
            // InternalMyDsl.g:595:2: ( (enumLiteral_0= 'Planning' ) | (enumLiteral_1= 'RDV' ) )
            {
            // InternalMyDsl.g:595:2: ( (enumLiteral_0= 'Planning' ) | (enumLiteral_1= 'RDV' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:596:3: (enumLiteral_0= 'Planning' )
                    {
                    // InternalMyDsl.g:596:3: (enumLiteral_0= 'Planning' )
                    // InternalMyDsl.g:597:4: enumLiteral_0= 'Planning'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSourceSelectionAccess().getPlanningEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceSelectionAccess().getPlanningEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:604:3: (enumLiteral_1= 'RDV' )
                    {
                    // InternalMyDsl.g:604:3: (enumLiteral_1= 'RDV' )
                    // InternalMyDsl.g:605:4: enumLiteral_1= 'RDV'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSourceSelectionAccess().getRDVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSourceSelectionAccess().getRDVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceSelection"


    // $ANTLR start "ruleSourcePres"
    // InternalMyDsl.g:615:1: ruleSourcePres returns [Enumerator current=null] : ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) ) ;
    public final Enumerator ruleSourcePres() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:621:2: ( ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) ) )
            // InternalMyDsl.g:622:2: ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) )
            {
            // InternalMyDsl.g:622:2: ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:623:3: (enumLiteral_0= 'basique' )
                    {
                    // InternalMyDsl.g:623:3: (enumLiteral_0= 'basique' )
                    // InternalMyDsl.g:624:4: enumLiteral_0= 'basique'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:631:3: (enumLiteral_1= 'card' )
                    {
                    // InternalMyDsl.g:631:3: (enumLiteral_1= 'card' )
                    // InternalMyDsl.g:632:4: enumLiteral_1= 'card'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSourcePresAccess().getCardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSourcePresAccess().getCardEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourcePres"


    // $ANTLR start "ruleSourceLogo"
    // InternalMyDsl.g:642:1: ruleSourceLogo returns [Enumerator current=null] : ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) ) ;
    public final Enumerator ruleSourceLogo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:648:2: ( ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) ) )
            // InternalMyDsl.g:649:2: ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) )
            {
            // InternalMyDsl.g:649:2: ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:650:3: (enumLiteral_0= 'comute' )
                    {
                    // InternalMyDsl.g:650:3: (enumLiteral_0= 'comute' )
                    // InternalMyDsl.g:651:4: enumLiteral_0= 'comute'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:658:3: (enumLiteral_1= 'rdv' )
                    {
                    // InternalMyDsl.g:658:3: (enumLiteral_1= 'rdv' )
                    // InternalMyDsl.g:659:4: enumLiteral_1= 'rdv'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:666:3: (enumLiteral_2= 'trajet' )
                    {
                    // InternalMyDsl.g:666:3: (enumLiteral_2= 'trajet' )
                    // InternalMyDsl.g:667:4: enumLiteral_2= 'trajet'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSourceLogoAccess().getTrajetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSourceLogoAccess().getTrajetEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceLogo"


    // $ANTLR start "ruleSourceName"
    // InternalMyDsl.g:677:1: ruleSourceName returns [Enumerator current=null] : ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) ) ;
    public final Enumerator ruleSourceName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:683:2: ( ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) ) )
            // InternalMyDsl.g:684:2: ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) )
            {
            // InternalMyDsl.g:684:2: ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            else if ( (LA12_0==38) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:685:3: (enumLiteral_0= 'Tisseo' )
                    {
                    // InternalMyDsl.g:685:3: (enumLiteral_0= 'Tisseo' )
                    // InternalMyDsl.g:686:4: enumLiteral_0= 'Tisseo'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:693:3: (enumLiteral_1= 'GoogleMap' )
                    {
                    // InternalMyDsl.g:693:3: (enumLiteral_1= 'GoogleMap' )
                    // InternalMyDsl.g:694:4: enumLiteral_1= 'GoogleMap'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSourceNameAccess().getGoogleMapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSourceNameAccess().getGoogleMapEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000006007000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}