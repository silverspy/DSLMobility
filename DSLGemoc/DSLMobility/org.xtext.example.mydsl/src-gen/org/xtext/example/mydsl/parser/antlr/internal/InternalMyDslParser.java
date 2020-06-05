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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'geolocalisation'", "'Page'", "'description'", "'mail'", "'telephone'", "'heure_ouverture'", "'heure_fermeture'", "'nb_Pers'", "'Port_back'", "'Port_front'", "'menu'", "'presentation'", "'logo'", "'source'", "','", "'SideBar'", "'NavBar'", "'basique'", "'card'", "'comute'", "'rdv'", "'trajet'", "'Tisseo'", "'GoogleMap'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalMyDsl.g:72:1: rulePage returns [EObject current=null] : ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEString ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEString ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEString ) ) (otherlv_15= 'Port_back' ( (lv_Port_back_16_0= ruleEString ) ) )? (otherlv_17= 'Port_front' ( (lv_Port_front_18_0= ruleEString ) ) )? otherlv_19= 'menu' ( (lv_menu_20_0= ruleSourceMenu ) ) otherlv_21= 'presentation' ( (lv_presentation_22_0= ruleSourcePres ) ) otherlv_23= 'logo' ( (lv_logo_24_0= ruleSourceLogo ) ) otherlv_25= 'source' ( (lv_source_26_0= ruleSource ) ) (otherlv_27= ',' ( (lv_source_28_0= ruleSource ) ) )* ) ;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_mail_6_0 = null;

        AntlrDatatypeRuleToken lv_telephone_8_0 = null;

        AntlrDatatypeRuleToken lv_heure_ouverture_10_0 = null;

        AntlrDatatypeRuleToken lv_heure_fermeture_12_0 = null;

        AntlrDatatypeRuleToken lv_nb_Pers_14_0 = null;

        AntlrDatatypeRuleToken lv_Port_back_16_0 = null;

        AntlrDatatypeRuleToken lv_Port_front_18_0 = null;

        Enumerator lv_menu_20_0 = null;

        Enumerator lv_presentation_22_0 = null;

        Enumerator lv_logo_24_0 = null;

        EObject lv_source_26_0 = null;

        EObject lv_source_28_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEString ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEString ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEString ) ) (otherlv_15= 'Port_back' ( (lv_Port_back_16_0= ruleEString ) ) )? (otherlv_17= 'Port_front' ( (lv_Port_front_18_0= ruleEString ) ) )? otherlv_19= 'menu' ( (lv_menu_20_0= ruleSourceMenu ) ) otherlv_21= 'presentation' ( (lv_presentation_22_0= ruleSourcePres ) ) otherlv_23= 'logo' ( (lv_logo_24_0= ruleSourceLogo ) ) otherlv_25= 'source' ( (lv_source_26_0= ruleSource ) ) (otherlv_27= ',' ( (lv_source_28_0= ruleSource ) ) )* ) )
            // InternalMyDsl.g:79:2: ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEString ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEString ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEString ) ) (otherlv_15= 'Port_back' ( (lv_Port_back_16_0= ruleEString ) ) )? (otherlv_17= 'Port_front' ( (lv_Port_front_18_0= ruleEString ) ) )? otherlv_19= 'menu' ( (lv_menu_20_0= ruleSourceMenu ) ) otherlv_21= 'presentation' ( (lv_presentation_22_0= ruleSourcePres ) ) otherlv_23= 'logo' ( (lv_logo_24_0= ruleSourceLogo ) ) otherlv_25= 'source' ( (lv_source_26_0= ruleSource ) ) (otherlv_27= ',' ( (lv_source_28_0= ruleSource ) ) )* )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEString ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEString ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEString ) ) (otherlv_15= 'Port_back' ( (lv_Port_back_16_0= ruleEString ) ) )? (otherlv_17= 'Port_front' ( (lv_Port_front_18_0= ruleEString ) ) )? otherlv_19= 'menu' ( (lv_menu_20_0= ruleSourceMenu ) ) otherlv_21= 'presentation' ( (lv_presentation_22_0= ruleSourcePres ) ) otherlv_23= 'logo' ( (lv_logo_24_0= ruleSourceLogo ) ) otherlv_25= 'source' ( (lv_source_26_0= ruleSource ) ) (otherlv_27= ',' ( (lv_source_28_0= ruleSource ) ) )* )
            // InternalMyDsl.g:80:3: ( (lv_geolocalisation_0_0= 'geolocalisation' ) )? otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'mail' ( (lv_mail_6_0= ruleEString ) ) otherlv_7= 'telephone' ( (lv_telephone_8_0= ruleEString ) ) otherlv_9= 'heure_ouverture' ( (lv_heure_ouverture_10_0= ruleEString ) ) otherlv_11= 'heure_fermeture' ( (lv_heure_fermeture_12_0= ruleEString ) ) otherlv_13= 'nb_Pers' ( (lv_nb_Pers_14_0= ruleEString ) ) (otherlv_15= 'Port_back' ( (lv_Port_back_16_0= ruleEString ) ) )? (otherlv_17= 'Port_front' ( (lv_Port_front_18_0= ruleEString ) ) )? otherlv_19= 'menu' ( (lv_menu_20_0= ruleSourceMenu ) ) otherlv_21= 'presentation' ( (lv_presentation_22_0= ruleSourcePres ) ) otherlv_23= 'logo' ( (lv_logo_24_0= ruleSourceLogo ) ) otherlv_25= 'source' ( (lv_source_26_0= ruleSource ) ) (otherlv_27= ',' ( (lv_source_28_0= ruleSource ) ) )*
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

            otherlv_9=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getPageAccess().getHeure_ouvertureKeyword_9());
            		
            // InternalMyDsl.g:190:3: ( (lv_heure_ouverture_10_0= ruleEString ) )
            // InternalMyDsl.g:191:4: (lv_heure_ouverture_10_0= ruleEString )
            {
            // InternalMyDsl.g:191:4: (lv_heure_ouverture_10_0= ruleEString )
            // InternalMyDsl.g:192:5: lv_heure_ouverture_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getHeure_ouvertureEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_heure_ouverture_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"heure_ouverture",
            						lv_heure_ouverture_10_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getPageAccess().getHeure_fermetureKeyword_11());
            		
            // InternalMyDsl.g:213:3: ( (lv_heure_fermeture_12_0= ruleEString ) )
            // InternalMyDsl.g:214:4: (lv_heure_fermeture_12_0= ruleEString )
            {
            // InternalMyDsl.g:214:4: (lv_heure_fermeture_12_0= ruleEString )
            // InternalMyDsl.g:215:5: lv_heure_fermeture_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getHeure_fermetureEStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_heure_fermeture_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"heure_fermeture",
            						lv_heure_fermeture_12_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getPageAccess().getNb_PersKeyword_13());
            		
            // InternalMyDsl.g:236:3: ( (lv_nb_Pers_14_0= ruleEString ) )
            // InternalMyDsl.g:237:4: (lv_nb_Pers_14_0= ruleEString )
            {
            // InternalMyDsl.g:237:4: (lv_nb_Pers_14_0= ruleEString )
            // InternalMyDsl.g:238:5: lv_nb_Pers_14_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getNb_PersEStringParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_nb_Pers_14_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"nb_Pers",
            						lv_nb_Pers_14_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:255:3: (otherlv_15= 'Port_back' ( (lv_Port_back_16_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:256:4: otherlv_15= 'Port_back' ( (lv_Port_back_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getPageAccess().getPort_backKeyword_15_0());
                    			
                    // InternalMyDsl.g:260:4: ( (lv_Port_back_16_0= ruleEString ) )
                    // InternalMyDsl.g:261:5: (lv_Port_back_16_0= ruleEString )
                    {
                    // InternalMyDsl.g:261:5: (lv_Port_back_16_0= ruleEString )
                    // InternalMyDsl.g:262:6: lv_Port_back_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getPort_backEStringParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_Port_back_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						set(
                    							current,
                    							"Port_back",
                    							lv_Port_back_16_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:280:3: (otherlv_17= 'Port_front' ( (lv_Port_front_18_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:281:4: otherlv_17= 'Port_front' ( (lv_Port_front_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getPageAccess().getPort_frontKeyword_16_0());
                    			
                    // InternalMyDsl.g:285:4: ( (lv_Port_front_18_0= ruleEString ) )
                    // InternalMyDsl.g:286:5: (lv_Port_front_18_0= ruleEString )
                    {
                    // InternalMyDsl.g:286:5: (lv_Port_front_18_0= ruleEString )
                    // InternalMyDsl.g:287:6: lv_Port_front_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getPort_frontEStringParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_Port_front_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						set(
                    							current,
                    							"Port_front",
                    							lv_Port_front_18_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_19, grammarAccess.getPageAccess().getMenuKeyword_17());
            		
            // InternalMyDsl.g:309:3: ( (lv_menu_20_0= ruleSourceMenu ) )
            // InternalMyDsl.g:310:4: (lv_menu_20_0= ruleSourceMenu )
            {
            // InternalMyDsl.g:310:4: (lv_menu_20_0= ruleSourceMenu )
            // InternalMyDsl.g:311:5: lv_menu_20_0= ruleSourceMenu
            {

            					newCompositeNode(grammarAccess.getPageAccess().getMenuSourceMenuEnumRuleCall_18_0());
            				
            pushFollow(FOLLOW_15);
            lv_menu_20_0=ruleSourceMenu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"menu",
            						lv_menu_20_0,
            						"org.xtext.example.mydsl.MyDsl.SourceMenu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_21, grammarAccess.getPageAccess().getPresentationKeyword_19());
            		
            // InternalMyDsl.g:332:3: ( (lv_presentation_22_0= ruleSourcePres ) )
            // InternalMyDsl.g:333:4: (lv_presentation_22_0= ruleSourcePres )
            {
            // InternalMyDsl.g:333:4: (lv_presentation_22_0= ruleSourcePres )
            // InternalMyDsl.g:334:5: lv_presentation_22_0= ruleSourcePres
            {

            					newCompositeNode(grammarAccess.getPageAccess().getPresentationSourcePresEnumRuleCall_20_0());
            				
            pushFollow(FOLLOW_17);
            lv_presentation_22_0=ruleSourcePres();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"presentation",
            						lv_presentation_22_0,
            						"org.xtext.example.mydsl.MyDsl.SourcePres");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_23, grammarAccess.getPageAccess().getLogoKeyword_21());
            		
            // InternalMyDsl.g:355:3: ( (lv_logo_24_0= ruleSourceLogo ) )
            // InternalMyDsl.g:356:4: (lv_logo_24_0= ruleSourceLogo )
            {
            // InternalMyDsl.g:356:4: (lv_logo_24_0= ruleSourceLogo )
            // InternalMyDsl.g:357:5: lv_logo_24_0= ruleSourceLogo
            {

            					newCompositeNode(grammarAccess.getPageAccess().getLogoSourceLogoEnumRuleCall_22_0());
            				
            pushFollow(FOLLOW_19);
            lv_logo_24_0=ruleSourceLogo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"logo",
            						lv_logo_24_0,
            						"org.xtext.example.mydsl.MyDsl.SourceLogo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_25=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_25, grammarAccess.getPageAccess().getSourceKeyword_23());
            		
            // InternalMyDsl.g:378:3: ( (lv_source_26_0= ruleSource ) )
            // InternalMyDsl.g:379:4: (lv_source_26_0= ruleSource )
            {
            // InternalMyDsl.g:379:4: (lv_source_26_0= ruleSource )
            // InternalMyDsl.g:380:5: lv_source_26_0= ruleSource
            {

            					newCompositeNode(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalMyDsl.g:397:3: (otherlv_27= ',' ( (lv_source_28_0= ruleSource ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:398:4: otherlv_27= ',' ( (lv_source_28_0= ruleSource ) )
            	    {
            	    otherlv_27=(Token)match(input,25,FOLLOW_20); 

            	    				newLeafNode(otherlv_27, grammarAccess.getPageAccess().getCommaKeyword_25_0());
            	    			
            	    // InternalMyDsl.g:402:4: ( (lv_source_28_0= ruleSource ) )
            	    // InternalMyDsl.g:403:5: (lv_source_28_0= ruleSource )
            	    {
            	    // InternalMyDsl.g:403:5: (lv_source_28_0= ruleSource )
            	    // InternalMyDsl.g:404:6: lv_source_28_0= ruleSource
            	    {

            	    						newCompositeNode(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_25_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_source_28_0=ruleSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"source",
            	    							lv_source_28_0,
            	    							"org.xtext.example.mydsl.MyDsl.Source");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // InternalMyDsl.g:426:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:426:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:427:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:433:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:439:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:440:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:440:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMyDsl.g:441:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:449:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:460:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalMyDsl.g:460:47: (iv_ruleSource= ruleSource EOF )
            // InternalMyDsl.g:461:2: iv_ruleSource= ruleSource EOF
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
    // InternalMyDsl.g:467:1: ruleSource returns [EObject current=null] : ( () ( (lv_name_1_0= ruleSourceName ) )? ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:473:2: ( ( () ( (lv_name_1_0= ruleSourceName ) )? ) )
            // InternalMyDsl.g:474:2: ( () ( (lv_name_1_0= ruleSourceName ) )? )
            {
            // InternalMyDsl.g:474:2: ( () ( (lv_name_1_0= ruleSourceName ) )? )
            // InternalMyDsl.g:475:3: () ( (lv_name_1_0= ruleSourceName ) )?
            {
            // InternalMyDsl.g:475:3: ()
            // InternalMyDsl.g:476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceAccess().getSourceAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:482:3: ( (lv_name_1_0= ruleSourceName ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=33 && LA6_0<=34)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:483:4: (lv_name_1_0= ruleSourceName )
                    {
                    // InternalMyDsl.g:483:4: (lv_name_1_0= ruleSourceName )
                    // InternalMyDsl.g:484:5: lv_name_1_0= ruleSourceName
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


    // $ANTLR start "ruleSourceMenu"
    // InternalMyDsl.g:505:1: ruleSourceMenu returns [Enumerator current=null] : ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) ) ;
    public final Enumerator ruleSourceMenu() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:511:2: ( ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) ) )
            // InternalMyDsl.g:512:2: ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) )
            {
            // InternalMyDsl.g:512:2: ( (enumLiteral_0= 'SideBar' ) | (enumLiteral_1= 'NavBar' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:513:3: (enumLiteral_0= 'SideBar' )
                    {
                    // InternalMyDsl.g:513:3: (enumLiteral_0= 'SideBar' )
                    // InternalMyDsl.g:514:4: enumLiteral_0= 'SideBar'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:521:3: (enumLiteral_1= 'NavBar' )
                    {
                    // InternalMyDsl.g:521:3: (enumLiteral_1= 'NavBar' )
                    // InternalMyDsl.g:522:4: enumLiteral_1= 'NavBar'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "ruleSourcePres"
    // InternalMyDsl.g:532:1: ruleSourcePres returns [Enumerator current=null] : ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) ) ;
    public final Enumerator ruleSourcePres() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:538:2: ( ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) ) )
            // InternalMyDsl.g:539:2: ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) )
            {
            // InternalMyDsl.g:539:2: ( (enumLiteral_0= 'basique' ) | (enumLiteral_1= 'card' ) )
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
                    // InternalMyDsl.g:540:3: (enumLiteral_0= 'basique' )
                    {
                    // InternalMyDsl.g:540:3: (enumLiteral_0= 'basique' )
                    // InternalMyDsl.g:541:4: enumLiteral_0= 'basique'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:548:3: (enumLiteral_1= 'card' )
                    {
                    // InternalMyDsl.g:548:3: (enumLiteral_1= 'card' )
                    // InternalMyDsl.g:549:4: enumLiteral_1= 'card'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

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
    // InternalMyDsl.g:559:1: ruleSourceLogo returns [Enumerator current=null] : ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) ) ;
    public final Enumerator ruleSourceLogo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:565:2: ( ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) ) )
            // InternalMyDsl.g:566:2: ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) )
            {
            // InternalMyDsl.g:566:2: ( (enumLiteral_0= 'comute' ) | (enumLiteral_1= 'rdv' ) | (enumLiteral_2= 'trajet' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:567:3: (enumLiteral_0= 'comute' )
                    {
                    // InternalMyDsl.g:567:3: (enumLiteral_0= 'comute' )
                    // InternalMyDsl.g:568:4: enumLiteral_0= 'comute'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:575:3: (enumLiteral_1= 'rdv' )
                    {
                    // InternalMyDsl.g:575:3: (enumLiteral_1= 'rdv' )
                    // InternalMyDsl.g:576:4: enumLiteral_1= 'rdv'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:583:3: (enumLiteral_2= 'trajet' )
                    {
                    // InternalMyDsl.g:583:3: (enumLiteral_2= 'trajet' )
                    // InternalMyDsl.g:584:4: enumLiteral_2= 'trajet'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalMyDsl.g:594:1: ruleSourceName returns [Enumerator current=null] : ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) ) ;
    public final Enumerator ruleSourceName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:600:2: ( ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) ) )
            // InternalMyDsl.g:601:2: ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) )
            {
            // InternalMyDsl.g:601:2: ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            else if ( (LA10_0==34) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:602:3: (enumLiteral_0= 'Tisseo' )
                    {
                    // InternalMyDsl.g:602:3: (enumLiteral_0= 'Tisseo' )
                    // InternalMyDsl.g:603:4: enumLiteral_0= 'Tisseo'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:610:3: (enumLiteral_1= 'GoogleMap' )
                    {
                    // InternalMyDsl.g:610:3: (enumLiteral_1= 'GoogleMap' )
                    // InternalMyDsl.g:611:4: enumLiteral_1= 'GoogleMap'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000602000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});

}