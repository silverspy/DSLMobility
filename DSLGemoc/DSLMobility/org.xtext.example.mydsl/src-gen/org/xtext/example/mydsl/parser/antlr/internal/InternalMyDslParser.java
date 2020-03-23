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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'source'", "','", "'Tisseo'", "'GoogleMap'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalMyDsl.g:72:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( (lv_source_3_0= ruleSource ) ) (otherlv_4= ',' ( (lv_source_5_0= ruleSource ) ) )* ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_source_3_0 = null;

        EObject lv_source_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( (lv_source_3_0= ruleSource ) ) (otherlv_4= ',' ( (lv_source_5_0= ruleSource ) ) )* ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( (lv_source_3_0= ruleSource ) ) (otherlv_4= ',' ( (lv_source_5_0= ruleSource ) ) )* )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( (lv_source_3_0= ruleSource ) ) (otherlv_4= ',' ( (lv_source_5_0= ruleSource ) ) )* )
            // InternalMyDsl.g:80:3: otherlv_0= 'Page' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'source' ( (lv_source_3_0= ruleSource ) ) (otherlv_4= ',' ( (lv_source_5_0= ruleSource ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getSourceKeyword_2());
            		
            // InternalMyDsl.g:107:3: ( (lv_source_3_0= ruleSource ) )
            // InternalMyDsl.g:108:4: (lv_source_3_0= ruleSource )
            {
            // InternalMyDsl.g:108:4: (lv_source_3_0= ruleSource )
            // InternalMyDsl.g:109:5: lv_source_3_0= ruleSource
            {

            					newCompositeNode(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_source_3_0=ruleSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					add(
            						current,
            						"source",
            						lv_source_3_0,
            						"org.xtext.example.mydsl.MyDsl.Source");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:126:3: (otherlv_4= ',' ( (lv_source_5_0= ruleSource ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:127:4: otherlv_4= ',' ( (lv_source_5_0= ruleSource ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPageAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:131:4: ( (lv_source_5_0= ruleSource ) )
            	    // InternalMyDsl.g:132:5: (lv_source_5_0= ruleSource )
            	    {
            	    // InternalMyDsl.g:132:5: (lv_source_5_0= ruleSource )
            	    // InternalMyDsl.g:133:6: lv_source_5_0= ruleSource
            	    {

            	    						newCompositeNode(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_source_5_0=ruleSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"source",
            	    							lv_source_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Source");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalMyDsl.g:155:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:155:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:156:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:162:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:168:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:169:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:169:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:170:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:178:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:189:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalMyDsl.g:189:47: (iv_ruleSource= ruleSource EOF )
            // InternalMyDsl.g:190:2: iv_ruleSource= ruleSource EOF
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
    // InternalMyDsl.g:196:1: ruleSource returns [EObject current=null] : ( () ( (lv_name_1_0= ruleSourceName ) )? ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:202:2: ( ( () ( (lv_name_1_0= ruleSourceName ) )? ) )
            // InternalMyDsl.g:203:2: ( () ( (lv_name_1_0= ruleSourceName ) )? )
            {
            // InternalMyDsl.g:203:2: ( () ( (lv_name_1_0= ruleSourceName ) )? )
            // InternalMyDsl.g:204:3: () ( (lv_name_1_0= ruleSourceName ) )?
            {
            // InternalMyDsl.g:204:3: ()
            // InternalMyDsl.g:205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceAccess().getSourceAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:211:3: ( (lv_name_1_0= ruleSourceName ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:212:4: (lv_name_1_0= ruleSourceName )
                    {
                    // InternalMyDsl.g:212:4: (lv_name_1_0= ruleSourceName )
                    // InternalMyDsl.g:213:5: lv_name_1_0= ruleSourceName
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


    // $ANTLR start "ruleSourceName"
    // InternalMyDsl.g:234:1: ruleSourceName returns [Enumerator current=null] : ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) ) ;
    public final Enumerator ruleSourceName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:240:2: ( ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) ) )
            // InternalMyDsl.g:241:2: ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) )
            {
            // InternalMyDsl.g:241:2: ( (enumLiteral_0= 'Tisseo' ) | (enumLiteral_1= 'GoogleMap' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:242:3: (enumLiteral_0= 'Tisseo' )
                    {
                    // InternalMyDsl.g:242:3: (enumLiteral_0= 'Tisseo' )
                    // InternalMyDsl.g:243:4: enumLiteral_0= 'Tisseo'
                    {
                    enumLiteral_0=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:250:3: (enumLiteral_1= 'GoogleMap' )
                    {
                    // InternalMyDsl.g:250:3: (enumLiteral_1= 'GoogleMap' )
                    // InternalMyDsl.g:251:4: enumLiteral_1= 'GoogleMap'
                    {
                    enumLiteral_1=(Token)match(input,15,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});

}