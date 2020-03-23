package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Tisseo'", "'GoogleMap'", "'Page'", "'source'", "','"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePage"
    // InternalMyDsl.g:53:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulePage EOF )
            // InternalMyDsl.g:55:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalMyDsl.g:62:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Page__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Page__Group__0 )
            // InternalMyDsl.g:69:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSource"
    // InternalMyDsl.g:103:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSource EOF )
            // InternalMyDsl.g:105:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalMyDsl.g:112:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Source__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Source__Group__0 )
            // InternalMyDsl.g:119:4: rule__Source__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "ruleSourceName"
    // InternalMyDsl.g:128:1: ruleSourceName : ( ( rule__SourceName__Alternatives ) ) ;
    public final void ruleSourceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:132:1: ( ( ( rule__SourceName__Alternatives ) ) )
            // InternalMyDsl.g:133:2: ( ( rule__SourceName__Alternatives ) )
            {
            // InternalMyDsl.g:133:2: ( ( rule__SourceName__Alternatives ) )
            // InternalMyDsl.g:134:3: ( rule__SourceName__Alternatives )
            {
             before(grammarAccess.getSourceNameAccess().getAlternatives()); 
            // InternalMyDsl.g:135:3: ( rule__SourceName__Alternatives )
            // InternalMyDsl.g:135:4: rule__SourceName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SourceName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourceNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceName"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:143:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:147:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:148:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:148:2: ( RULE_STRING )
                    // InternalMyDsl.g:149:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:154:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:154:2: ( RULE_ID )
                    // InternalMyDsl.g:155:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SourceName__Alternatives"
    // InternalMyDsl.g:164:1: rule__SourceName__Alternatives : ( ( ( 'Tisseo' ) ) | ( ( 'GoogleMap' ) ) );
    public final void rule__SourceName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( ( 'Tisseo' ) ) | ( ( 'GoogleMap' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:169:2: ( ( 'Tisseo' ) )
                    {
                    // InternalMyDsl.g:169:2: ( ( 'Tisseo' ) )
                    // InternalMyDsl.g:170:3: ( 'Tisseo' )
                    {
                     before(grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:171:3: ( 'Tisseo' )
                    // InternalMyDsl.g:171:4: 'Tisseo'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:175:2: ( ( 'GoogleMap' ) )
                    {
                    // InternalMyDsl.g:175:2: ( ( 'GoogleMap' ) )
                    // InternalMyDsl.g:176:3: ( 'GoogleMap' )
                    {
                     before(grammarAccess.getSourceNameAccess().getGoogleMapEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:177:3: ( 'GoogleMap' )
                    // InternalMyDsl.g:177:4: 'GoogleMap'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceNameAccess().getGoogleMapEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceName__Alternatives"


    // $ANTLR start "rule__Page__Group__0"
    // InternalMyDsl.g:185:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalMyDsl.g:190:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalMyDsl.g:197:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:201:1: ( ( 'Page' ) )
            // InternalMyDsl.g:202:1: ( 'Page' )
            {
            // InternalMyDsl.g:202:1: ( 'Page' )
            // InternalMyDsl.g:203:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalMyDsl.g:212:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalMyDsl.g:217:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalMyDsl.g:224:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:228:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalMyDsl.g:229:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:229:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalMyDsl.g:230:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:231:2: ( rule__Page__NameAssignment_1 )
            // InternalMyDsl.g:231:3: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalMyDsl.g:239:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalMyDsl.g:244:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalMyDsl.g:251:1: rule__Page__Group__2__Impl : ( 'source' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:255:1: ( ( 'source' ) )
            // InternalMyDsl.g:256:1: ( 'source' )
            {
            // InternalMyDsl.g:256:1: ( 'source' )
            // InternalMyDsl.g:257:2: 'source'
            {
             before(grammarAccess.getPageAccess().getSourceKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getSourceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // InternalMyDsl.g:266:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:270:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalMyDsl.g:271:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // InternalMyDsl.g:278:1: rule__Page__Group__3__Impl : ( ( rule__Page__SourceAssignment_3 ) ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:282:1: ( ( ( rule__Page__SourceAssignment_3 ) ) )
            // InternalMyDsl.g:283:1: ( ( rule__Page__SourceAssignment_3 ) )
            {
            // InternalMyDsl.g:283:1: ( ( rule__Page__SourceAssignment_3 ) )
            // InternalMyDsl.g:284:2: ( rule__Page__SourceAssignment_3 )
            {
             before(grammarAccess.getPageAccess().getSourceAssignment_3()); 
            // InternalMyDsl.g:285:2: ( rule__Page__SourceAssignment_3 )
            // InternalMyDsl.g:285:3: rule__Page__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Page__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // InternalMyDsl.g:293:1: rule__Page__Group__4 : rule__Page__Group__4__Impl ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( rule__Page__Group__4__Impl )
            // InternalMyDsl.g:298:2: rule__Page__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // InternalMyDsl.g:304:1: rule__Page__Group__4__Impl : ( ( rule__Page__Group_4__0 )* ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( ( ( rule__Page__Group_4__0 )* ) )
            // InternalMyDsl.g:309:1: ( ( rule__Page__Group_4__0 )* )
            {
            // InternalMyDsl.g:309:1: ( ( rule__Page__Group_4__0 )* )
            // InternalMyDsl.g:310:2: ( rule__Page__Group_4__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_4()); 
            // InternalMyDsl.g:311:2: ( rule__Page__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:311:3: rule__Page__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Page__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group_4__0"
    // InternalMyDsl.g:320:1: rule__Page__Group_4__0 : rule__Page__Group_4__0__Impl rule__Page__Group_4__1 ;
    public final void rule__Page__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:324:1: ( rule__Page__Group_4__0__Impl rule__Page__Group_4__1 )
            // InternalMyDsl.g:325:2: rule__Page__Group_4__0__Impl rule__Page__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__0"


    // $ANTLR start "rule__Page__Group_4__0__Impl"
    // InternalMyDsl.g:332:1: rule__Page__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:336:1: ( ( ',' ) )
            // InternalMyDsl.g:337:1: ( ',' )
            {
            // InternalMyDsl.g:337:1: ( ',' )
            // InternalMyDsl.g:338:2: ','
            {
             before(grammarAccess.getPageAccess().getCommaKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__0__Impl"


    // $ANTLR start "rule__Page__Group_4__1"
    // InternalMyDsl.g:347:1: rule__Page__Group_4__1 : rule__Page__Group_4__1__Impl ;
    public final void rule__Page__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( rule__Page__Group_4__1__Impl )
            // InternalMyDsl.g:352:2: rule__Page__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__1"


    // $ANTLR start "rule__Page__Group_4__1__Impl"
    // InternalMyDsl.g:358:1: rule__Page__Group_4__1__Impl : ( ( rule__Page__SourceAssignment_4_1 ) ) ;
    public final void rule__Page__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( ( ( rule__Page__SourceAssignment_4_1 ) ) )
            // InternalMyDsl.g:363:1: ( ( rule__Page__SourceAssignment_4_1 ) )
            {
            // InternalMyDsl.g:363:1: ( ( rule__Page__SourceAssignment_4_1 ) )
            // InternalMyDsl.g:364:2: ( rule__Page__SourceAssignment_4_1 )
            {
             before(grammarAccess.getPageAccess().getSourceAssignment_4_1()); 
            // InternalMyDsl.g:365:2: ( rule__Page__SourceAssignment_4_1 )
            // InternalMyDsl.g:365:3: rule__Page__SourceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__SourceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getSourceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_4__1__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalMyDsl.g:374:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalMyDsl.g:379:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Source__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // InternalMyDsl.g:386:1: rule__Source__Group__0__Impl : ( () ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:390:1: ( ( () ) )
            // InternalMyDsl.g:391:1: ( () )
            {
            // InternalMyDsl.g:391:1: ( () )
            // InternalMyDsl.g:392:2: ()
            {
             before(grammarAccess.getSourceAccess().getSourceAction_0()); 
            // InternalMyDsl.g:393:2: ()
            // InternalMyDsl.g:393:3: 
            {
            }

             after(grammarAccess.getSourceAccess().getSourceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // InternalMyDsl.g:401:1: rule__Source__Group__1 : rule__Source__Group__1__Impl ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( rule__Source__Group__1__Impl )
            // InternalMyDsl.g:406:2: rule__Source__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // InternalMyDsl.g:412:1: rule__Source__Group__1__Impl : ( ( rule__Source__NameAssignment_1 )? ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( ( ( rule__Source__NameAssignment_1 )? ) )
            // InternalMyDsl.g:417:1: ( ( rule__Source__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:417:1: ( ( rule__Source__NameAssignment_1 )? )
            // InternalMyDsl.g:418:2: ( rule__Source__NameAssignment_1 )?
            {
             before(grammarAccess.getSourceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:419:2: ( rule__Source__NameAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:419:3: rule__Source__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalMyDsl.g:428:1: rule__Page__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( ruleEString ) )
            // InternalMyDsl.g:433:2: ( ruleEString )
            {
            // InternalMyDsl.g:433:2: ( ruleEString )
            // InternalMyDsl.g:434:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Page__SourceAssignment_3"
    // InternalMyDsl.g:443:1: rule__Page__SourceAssignment_3 : ( ruleSource ) ;
    public final void rule__Page__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( ( ruleSource ) )
            // InternalMyDsl.g:448:2: ( ruleSource )
            {
            // InternalMyDsl.g:448:2: ( ruleSource )
            // InternalMyDsl.g:449:3: ruleSource
            {
             before(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__SourceAssignment_3"


    // $ANTLR start "rule__Page__SourceAssignment_4_1"
    // InternalMyDsl.g:458:1: rule__Page__SourceAssignment_4_1 : ( ruleSource ) ;
    public final void rule__Page__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:462:1: ( ( ruleSource ) )
            // InternalMyDsl.g:463:2: ( ruleSource )
            {
            // InternalMyDsl.g:463:2: ( ruleSource )
            // InternalMyDsl.g:464:3: ruleSource
            {
             before(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__SourceAssignment_4_1"


    // $ANTLR start "rule__Source__NameAssignment_1"
    // InternalMyDsl.g:473:1: rule__Source__NameAssignment_1 : ( ruleSourceName ) ;
    public final void rule__Source__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:477:1: ( ( ruleSourceName ) )
            // InternalMyDsl.g:478:2: ( ruleSourceName )
            {
            // InternalMyDsl.g:478:2: ( ruleSourceName )
            // InternalMyDsl.g:479:3: ruleSourceName
            {
             before(grammarAccess.getSourceAccess().getNameSourceNameEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceName();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getNameSourceNameEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});

}