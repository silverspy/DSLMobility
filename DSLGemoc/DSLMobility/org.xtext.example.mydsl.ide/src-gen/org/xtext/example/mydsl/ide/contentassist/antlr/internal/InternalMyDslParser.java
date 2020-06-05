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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SideBar'", "'NavBar'", "'Planning'", "'RDV'", "'basique'", "'card'", "'comute'", "'rdv'", "'trajet'", "'Tisseo'", "'GoogleMap'", "'Page'", "'description'", "'mail'", "'telephone'", "'heure_ouverture'", "'heure_fermeture'", "'nb_Pers'", "'menu'", "'Selection'", "'presentation'", "'logo'", "'source'", "','", "'Port_back'", "'Port_front'", "'-'", "'geolocalisation'"
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


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEInt EOF )
            // InternalMyDsl.g:130:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:144:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSourceMenu"
    // InternalMyDsl.g:153:1: ruleSourceMenu : ( ( rule__SourceMenu__Alternatives ) ) ;
    public final void ruleSourceMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:157:1: ( ( ( rule__SourceMenu__Alternatives ) ) )
            // InternalMyDsl.g:158:2: ( ( rule__SourceMenu__Alternatives ) )
            {
            // InternalMyDsl.g:158:2: ( ( rule__SourceMenu__Alternatives ) )
            // InternalMyDsl.g:159:3: ( rule__SourceMenu__Alternatives )
            {
             before(grammarAccess.getSourceMenuAccess().getAlternatives()); 
            // InternalMyDsl.g:160:3: ( rule__SourceMenu__Alternatives )
            // InternalMyDsl.g:160:4: rule__SourceMenu__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SourceMenu__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourceMenuAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSourceMenu"


    // $ANTLR start "ruleSourceSelection"
    // InternalMyDsl.g:169:1: ruleSourceSelection : ( ( rule__SourceSelection__Alternatives ) ) ;
    public final void ruleSourceSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:173:1: ( ( ( rule__SourceSelection__Alternatives ) ) )
            // InternalMyDsl.g:174:2: ( ( rule__SourceSelection__Alternatives ) )
            {
            // InternalMyDsl.g:174:2: ( ( rule__SourceSelection__Alternatives ) )
            // InternalMyDsl.g:175:3: ( rule__SourceSelection__Alternatives )
            {
             before(grammarAccess.getSourceSelectionAccess().getAlternatives()); 
            // InternalMyDsl.g:176:3: ( rule__SourceSelection__Alternatives )
            // InternalMyDsl.g:176:4: rule__SourceSelection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SourceSelection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourceSelectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSourceSelection"


    // $ANTLR start "ruleSourcePres"
    // InternalMyDsl.g:185:1: ruleSourcePres : ( ( rule__SourcePres__Alternatives ) ) ;
    public final void ruleSourcePres() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( ( ( rule__SourcePres__Alternatives ) ) )
            // InternalMyDsl.g:190:2: ( ( rule__SourcePres__Alternatives ) )
            {
            // InternalMyDsl.g:190:2: ( ( rule__SourcePres__Alternatives ) )
            // InternalMyDsl.g:191:3: ( rule__SourcePres__Alternatives )
            {
             before(grammarAccess.getSourcePresAccess().getAlternatives()); 
            // InternalMyDsl.g:192:3: ( rule__SourcePres__Alternatives )
            // InternalMyDsl.g:192:4: rule__SourcePres__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SourcePres__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourcePresAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSourcePres"


    // $ANTLR start "ruleSourceLogo"
    // InternalMyDsl.g:201:1: ruleSourceLogo : ( ( rule__SourceLogo__Alternatives ) ) ;
    public final void ruleSourceLogo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:205:1: ( ( ( rule__SourceLogo__Alternatives ) ) )
            // InternalMyDsl.g:206:2: ( ( rule__SourceLogo__Alternatives ) )
            {
            // InternalMyDsl.g:206:2: ( ( rule__SourceLogo__Alternatives ) )
            // InternalMyDsl.g:207:3: ( rule__SourceLogo__Alternatives )
            {
             before(grammarAccess.getSourceLogoAccess().getAlternatives()); 
            // InternalMyDsl.g:208:3: ( rule__SourceLogo__Alternatives )
            // InternalMyDsl.g:208:4: rule__SourceLogo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SourceLogo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourceLogoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSourceLogo"


    // $ANTLR start "ruleSourceName"
    // InternalMyDsl.g:217:1: ruleSourceName : ( ( rule__SourceName__Alternatives ) ) ;
    public final void ruleSourceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:221:1: ( ( ( rule__SourceName__Alternatives ) ) )
            // InternalMyDsl.g:222:2: ( ( rule__SourceName__Alternatives ) )
            {
            // InternalMyDsl.g:222:2: ( ( rule__SourceName__Alternatives ) )
            // InternalMyDsl.g:223:3: ( rule__SourceName__Alternatives )
            {
             before(grammarAccess.getSourceNameAccess().getAlternatives()); 
            // InternalMyDsl.g:224:3: ( rule__SourceName__Alternatives )
            // InternalMyDsl.g:224:4: rule__SourceName__Alternatives
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
    // InternalMyDsl.g:232:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:236:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:237:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:237:2: ( RULE_STRING )
                    // InternalMyDsl.g:238:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:243:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:243:2: ( RULE_ID )
                    // InternalMyDsl.g:244:3: RULE_ID
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


    // $ANTLR start "rule__SourceMenu__Alternatives"
    // InternalMyDsl.g:253:1: rule__SourceMenu__Alternatives : ( ( ( 'SideBar' ) ) | ( ( 'NavBar' ) ) );
    public final void rule__SourceMenu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:257:1: ( ( ( 'SideBar' ) ) | ( ( 'NavBar' ) ) )
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
                    // InternalMyDsl.g:258:2: ( ( 'SideBar' ) )
                    {
                    // InternalMyDsl.g:258:2: ( ( 'SideBar' ) )
                    // InternalMyDsl.g:259:3: ( 'SideBar' )
                    {
                     before(grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:260:3: ( 'SideBar' )
                    // InternalMyDsl.g:260:4: 'SideBar'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:264:2: ( ( 'NavBar' ) )
                    {
                    // InternalMyDsl.g:264:2: ( ( 'NavBar' ) )
                    // InternalMyDsl.g:265:3: ( 'NavBar' )
                    {
                     before(grammarAccess.getSourceMenuAccess().getNavBarEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:266:3: ( 'NavBar' )
                    // InternalMyDsl.g:266:4: 'NavBar'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceMenuAccess().getNavBarEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SourceMenu__Alternatives"


    // $ANTLR start "rule__SourceSelection__Alternatives"
    // InternalMyDsl.g:274:1: rule__SourceSelection__Alternatives : ( ( ( 'Planning' ) ) | ( ( 'RDV' ) ) );
    public final void rule__SourceSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:278:1: ( ( ( 'Planning' ) ) | ( ( 'RDV' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:279:2: ( ( 'Planning' ) )
                    {
                    // InternalMyDsl.g:279:2: ( ( 'Planning' ) )
                    // InternalMyDsl.g:280:3: ( 'Planning' )
                    {
                     before(grammarAccess.getSourceSelectionAccess().getPlanningEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:281:3: ( 'Planning' )
                    // InternalMyDsl.g:281:4: 'Planning'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceSelectionAccess().getPlanningEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:285:2: ( ( 'RDV' ) )
                    {
                    // InternalMyDsl.g:285:2: ( ( 'RDV' ) )
                    // InternalMyDsl.g:286:3: ( 'RDV' )
                    {
                     before(grammarAccess.getSourceSelectionAccess().getRDVEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:287:3: ( 'RDV' )
                    // InternalMyDsl.g:287:4: 'RDV'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceSelectionAccess().getRDVEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SourceSelection__Alternatives"


    // $ANTLR start "rule__SourcePres__Alternatives"
    // InternalMyDsl.g:295:1: rule__SourcePres__Alternatives : ( ( ( 'basique' ) ) | ( ( 'card' ) ) );
    public final void rule__SourcePres__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( ( ( 'basique' ) ) | ( ( 'card' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:300:2: ( ( 'basique' ) )
                    {
                    // InternalMyDsl.g:300:2: ( ( 'basique' ) )
                    // InternalMyDsl.g:301:3: ( 'basique' )
                    {
                     before(grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:302:3: ( 'basique' )
                    // InternalMyDsl.g:302:4: 'basique'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:306:2: ( ( 'card' ) )
                    {
                    // InternalMyDsl.g:306:2: ( ( 'card' ) )
                    // InternalMyDsl.g:307:3: ( 'card' )
                    {
                     before(grammarAccess.getSourcePresAccess().getCardEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:308:3: ( 'card' )
                    // InternalMyDsl.g:308:4: 'card'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourcePresAccess().getCardEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SourcePres__Alternatives"


    // $ANTLR start "rule__SourceLogo__Alternatives"
    // InternalMyDsl.g:316:1: rule__SourceLogo__Alternatives : ( ( ( 'comute' ) ) | ( ( 'rdv' ) ) | ( ( 'trajet' ) ) );
    public final void rule__SourceLogo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( ( ( 'comute' ) ) | ( ( 'rdv' ) ) | ( ( 'trajet' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:321:2: ( ( 'comute' ) )
                    {
                    // InternalMyDsl.g:321:2: ( ( 'comute' ) )
                    // InternalMyDsl.g:322:3: ( 'comute' )
                    {
                     before(grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:323:3: ( 'comute' )
                    // InternalMyDsl.g:323:4: 'comute'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:327:2: ( ( 'rdv' ) )
                    {
                    // InternalMyDsl.g:327:2: ( ( 'rdv' ) )
                    // InternalMyDsl.g:328:3: ( 'rdv' )
                    {
                     before(grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:329:3: ( 'rdv' )
                    // InternalMyDsl.g:329:4: 'rdv'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:333:2: ( ( 'trajet' ) )
                    {
                    // InternalMyDsl.g:333:2: ( ( 'trajet' ) )
                    // InternalMyDsl.g:334:3: ( 'trajet' )
                    {
                     before(grammarAccess.getSourceLogoAccess().getTrajetEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:335:3: ( 'trajet' )
                    // InternalMyDsl.g:335:4: 'trajet'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceLogoAccess().getTrajetEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SourceLogo__Alternatives"


    // $ANTLR start "rule__SourceName__Alternatives"
    // InternalMyDsl.g:343:1: rule__SourceName__Alternatives : ( ( ( 'Tisseo' ) ) | ( ( 'GoogleMap' ) ) );
    public final void rule__SourceName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( ( ( 'Tisseo' ) ) | ( ( 'GoogleMap' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:348:2: ( ( 'Tisseo' ) )
                    {
                    // InternalMyDsl.g:348:2: ( ( 'Tisseo' ) )
                    // InternalMyDsl.g:349:3: ( 'Tisseo' )
                    {
                     before(grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:350:3: ( 'Tisseo' )
                    // InternalMyDsl.g:350:4: 'Tisseo'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:354:2: ( ( 'GoogleMap' ) )
                    {
                    // InternalMyDsl.g:354:2: ( ( 'GoogleMap' ) )
                    // InternalMyDsl.g:355:3: ( 'GoogleMap' )
                    {
                     before(grammarAccess.getSourceNameAccess().getGoogleMapEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:356:3: ( 'GoogleMap' )
                    // InternalMyDsl.g:356:4: 'GoogleMap'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:364:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalMyDsl.g:369:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalMyDsl.g:376:1: rule__Page__Group__0__Impl : ( ( rule__Page__GeolocalisationAssignment_0 )? ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( ( ( rule__Page__GeolocalisationAssignment_0 )? ) )
            // InternalMyDsl.g:381:1: ( ( rule__Page__GeolocalisationAssignment_0 )? )
            {
            // InternalMyDsl.g:381:1: ( ( rule__Page__GeolocalisationAssignment_0 )? )
            // InternalMyDsl.g:382:2: ( rule__Page__GeolocalisationAssignment_0 )?
            {
             before(grammarAccess.getPageAccess().getGeolocalisationAssignment_0()); 
            // InternalMyDsl.g:383:2: ( rule__Page__GeolocalisationAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:383:3: rule__Page__GeolocalisationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__GeolocalisationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGeolocalisationAssignment_0()); 

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
    // InternalMyDsl.g:391:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalMyDsl.g:396:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalMyDsl.g:403:1: rule__Page__Group__1__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( 'Page' ) )
            // InternalMyDsl.g:408:1: ( 'Page' )
            {
            // InternalMyDsl.g:408:1: ( 'Page' )
            // InternalMyDsl.g:409:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_1()); 

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
    // InternalMyDsl.g:418:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalMyDsl.g:423:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalMyDsl.g:430:1: rule__Page__Group__2__Impl : ( ( rule__Page__NameAssignment_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ( rule__Page__NameAssignment_2 ) ) )
            // InternalMyDsl.g:435:1: ( ( rule__Page__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:435:1: ( ( rule__Page__NameAssignment_2 ) )
            // InternalMyDsl.g:436:2: ( rule__Page__NameAssignment_2 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:437:2: ( rule__Page__NameAssignment_2 )
            // InternalMyDsl.g:437:3: rule__Page__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_2()); 

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
    // InternalMyDsl.g:445:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalMyDsl.g:450:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:457:1: rule__Page__Group__3__Impl : ( 'description' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( 'description' ) )
            // InternalMyDsl.g:462:1: ( 'description' )
            {
            // InternalMyDsl.g:462:1: ( 'description' )
            // InternalMyDsl.g:463:2: 'description'
            {
             before(grammarAccess.getPageAccess().getDescriptionKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getDescriptionKeyword_3()); 

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
    // InternalMyDsl.g:472:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalMyDsl.g:477:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__5();

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
    // InternalMyDsl.g:484:1: rule__Page__Group__4__Impl : ( ( rule__Page__DescriptionAssignment_4 ) ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( ( rule__Page__DescriptionAssignment_4 ) ) )
            // InternalMyDsl.g:489:1: ( ( rule__Page__DescriptionAssignment_4 ) )
            {
            // InternalMyDsl.g:489:1: ( ( rule__Page__DescriptionAssignment_4 ) )
            // InternalMyDsl.g:490:2: ( rule__Page__DescriptionAssignment_4 )
            {
             before(grammarAccess.getPageAccess().getDescriptionAssignment_4()); 
            // InternalMyDsl.g:491:2: ( rule__Page__DescriptionAssignment_4 )
            // InternalMyDsl.g:491:3: rule__Page__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Page__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getDescriptionAssignment_4()); 

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


    // $ANTLR start "rule__Page__Group__5"
    // InternalMyDsl.g:499:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalMyDsl.g:504:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__6();

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
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // InternalMyDsl.g:511:1: rule__Page__Group__5__Impl : ( 'mail' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( 'mail' ) )
            // InternalMyDsl.g:516:1: ( 'mail' )
            {
            // InternalMyDsl.g:516:1: ( 'mail' )
            // InternalMyDsl.g:517:2: 'mail'
            {
             before(grammarAccess.getPageAccess().getMailKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getMailKeyword_5()); 

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
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // InternalMyDsl.g:526:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalMyDsl.g:531:2: rule__Page__Group__6__Impl rule__Page__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Page__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__7();

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
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // InternalMyDsl.g:538:1: rule__Page__Group__6__Impl : ( ( rule__Page__MailAssignment_6 ) ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( ( ( rule__Page__MailAssignment_6 ) ) )
            // InternalMyDsl.g:543:1: ( ( rule__Page__MailAssignment_6 ) )
            {
            // InternalMyDsl.g:543:1: ( ( rule__Page__MailAssignment_6 ) )
            // InternalMyDsl.g:544:2: ( rule__Page__MailAssignment_6 )
            {
             before(grammarAccess.getPageAccess().getMailAssignment_6()); 
            // InternalMyDsl.g:545:2: ( rule__Page__MailAssignment_6 )
            // InternalMyDsl.g:545:3: rule__Page__MailAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Page__MailAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getMailAssignment_6()); 

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
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group__7"
    // InternalMyDsl.g:553:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // InternalMyDsl.g:558:2: rule__Page__Group__7__Impl rule__Page__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__8();

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
    // $ANTLR end "rule__Page__Group__7"


    // $ANTLR start "rule__Page__Group__7__Impl"
    // InternalMyDsl.g:565:1: rule__Page__Group__7__Impl : ( 'telephone' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( 'telephone' ) )
            // InternalMyDsl.g:570:1: ( 'telephone' )
            {
            // InternalMyDsl.g:570:1: ( 'telephone' )
            // InternalMyDsl.g:571:2: 'telephone'
            {
             before(grammarAccess.getPageAccess().getTelephoneKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getTelephoneKeyword_7()); 

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
    // $ANTLR end "rule__Page__Group__7__Impl"


    // $ANTLR start "rule__Page__Group__8"
    // InternalMyDsl.g:580:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // InternalMyDsl.g:585:2: rule__Page__Group__8__Impl rule__Page__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Page__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__9();

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
    // $ANTLR end "rule__Page__Group__8"


    // $ANTLR start "rule__Page__Group__8__Impl"
    // InternalMyDsl.g:592:1: rule__Page__Group__8__Impl : ( ( rule__Page__TelephoneAssignment_8 ) ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( ( rule__Page__TelephoneAssignment_8 ) ) )
            // InternalMyDsl.g:597:1: ( ( rule__Page__TelephoneAssignment_8 ) )
            {
            // InternalMyDsl.g:597:1: ( ( rule__Page__TelephoneAssignment_8 ) )
            // InternalMyDsl.g:598:2: ( rule__Page__TelephoneAssignment_8 )
            {
             before(grammarAccess.getPageAccess().getTelephoneAssignment_8()); 
            // InternalMyDsl.g:599:2: ( rule__Page__TelephoneAssignment_8 )
            // InternalMyDsl.g:599:3: rule__Page__TelephoneAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Page__TelephoneAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getTelephoneAssignment_8()); 

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
    // $ANTLR end "rule__Page__Group__8__Impl"


    // $ANTLR start "rule__Page__Group__9"
    // InternalMyDsl.g:607:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // InternalMyDsl.g:612:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__10();

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
    // $ANTLR end "rule__Page__Group__9"


    // $ANTLR start "rule__Page__Group__9__Impl"
    // InternalMyDsl.g:619:1: rule__Page__Group__9__Impl : ( 'heure_ouverture' ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( 'heure_ouverture' ) )
            // InternalMyDsl.g:624:1: ( 'heure_ouverture' )
            {
            // InternalMyDsl.g:624:1: ( 'heure_ouverture' )
            // InternalMyDsl.g:625:2: 'heure_ouverture'
            {
             before(grammarAccess.getPageAccess().getHeure_ouvertureKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getHeure_ouvertureKeyword_9()); 

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
    // $ANTLR end "rule__Page__Group__9__Impl"


    // $ANTLR start "rule__Page__Group__10"
    // InternalMyDsl.g:634:1: rule__Page__Group__10 : rule__Page__Group__10__Impl rule__Page__Group__11 ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Page__Group__10__Impl rule__Page__Group__11 )
            // InternalMyDsl.g:639:2: rule__Page__Group__10__Impl rule__Page__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Page__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__11();

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
    // $ANTLR end "rule__Page__Group__10"


    // $ANTLR start "rule__Page__Group__10__Impl"
    // InternalMyDsl.g:646:1: rule__Page__Group__10__Impl : ( ( rule__Page__Heure_ouvertureAssignment_10 ) ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Page__Heure_ouvertureAssignment_10 ) ) )
            // InternalMyDsl.g:651:1: ( ( rule__Page__Heure_ouvertureAssignment_10 ) )
            {
            // InternalMyDsl.g:651:1: ( ( rule__Page__Heure_ouvertureAssignment_10 ) )
            // InternalMyDsl.g:652:2: ( rule__Page__Heure_ouvertureAssignment_10 )
            {
             before(grammarAccess.getPageAccess().getHeure_ouvertureAssignment_10()); 
            // InternalMyDsl.g:653:2: ( rule__Page__Heure_ouvertureAssignment_10 )
            // InternalMyDsl.g:653:3: rule__Page__Heure_ouvertureAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Page__Heure_ouvertureAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getHeure_ouvertureAssignment_10()); 

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
    // $ANTLR end "rule__Page__Group__10__Impl"


    // $ANTLR start "rule__Page__Group__11"
    // InternalMyDsl.g:661:1: rule__Page__Group__11 : rule__Page__Group__11__Impl rule__Page__Group__12 ;
    public final void rule__Page__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Page__Group__11__Impl rule__Page__Group__12 )
            // InternalMyDsl.g:666:2: rule__Page__Group__11__Impl rule__Page__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__12();

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
    // $ANTLR end "rule__Page__Group__11"


    // $ANTLR start "rule__Page__Group__11__Impl"
    // InternalMyDsl.g:673:1: rule__Page__Group__11__Impl : ( 'heure_fermeture' ) ;
    public final void rule__Page__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( 'heure_fermeture' ) )
            // InternalMyDsl.g:678:1: ( 'heure_fermeture' )
            {
            // InternalMyDsl.g:678:1: ( 'heure_fermeture' )
            // InternalMyDsl.g:679:2: 'heure_fermeture'
            {
             before(grammarAccess.getPageAccess().getHeure_fermetureKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getHeure_fermetureKeyword_11()); 

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
    // $ANTLR end "rule__Page__Group__11__Impl"


    // $ANTLR start "rule__Page__Group__12"
    // InternalMyDsl.g:688:1: rule__Page__Group__12 : rule__Page__Group__12__Impl rule__Page__Group__13 ;
    public final void rule__Page__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Page__Group__12__Impl rule__Page__Group__13 )
            // InternalMyDsl.g:693:2: rule__Page__Group__12__Impl rule__Page__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Page__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__13();

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
    // $ANTLR end "rule__Page__Group__12"


    // $ANTLR start "rule__Page__Group__12__Impl"
    // InternalMyDsl.g:700:1: rule__Page__Group__12__Impl : ( ( rule__Page__Heure_fermetureAssignment_12 ) ) ;
    public final void rule__Page__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( ( rule__Page__Heure_fermetureAssignment_12 ) ) )
            // InternalMyDsl.g:705:1: ( ( rule__Page__Heure_fermetureAssignment_12 ) )
            {
            // InternalMyDsl.g:705:1: ( ( rule__Page__Heure_fermetureAssignment_12 ) )
            // InternalMyDsl.g:706:2: ( rule__Page__Heure_fermetureAssignment_12 )
            {
             before(grammarAccess.getPageAccess().getHeure_fermetureAssignment_12()); 
            // InternalMyDsl.g:707:2: ( rule__Page__Heure_fermetureAssignment_12 )
            // InternalMyDsl.g:707:3: rule__Page__Heure_fermetureAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Page__Heure_fermetureAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getHeure_fermetureAssignment_12()); 

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
    // $ANTLR end "rule__Page__Group__12__Impl"


    // $ANTLR start "rule__Page__Group__13"
    // InternalMyDsl.g:715:1: rule__Page__Group__13 : rule__Page__Group__13__Impl rule__Page__Group__14 ;
    public final void rule__Page__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( rule__Page__Group__13__Impl rule__Page__Group__14 )
            // InternalMyDsl.g:720:2: rule__Page__Group__13__Impl rule__Page__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__14();

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
    // $ANTLR end "rule__Page__Group__13"


    // $ANTLR start "rule__Page__Group__13__Impl"
    // InternalMyDsl.g:727:1: rule__Page__Group__13__Impl : ( 'nb_Pers' ) ;
    public final void rule__Page__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( 'nb_Pers' ) )
            // InternalMyDsl.g:732:1: ( 'nb_Pers' )
            {
            // InternalMyDsl.g:732:1: ( 'nb_Pers' )
            // InternalMyDsl.g:733:2: 'nb_Pers'
            {
             before(grammarAccess.getPageAccess().getNb_PersKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getNb_PersKeyword_13()); 

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
    // $ANTLR end "rule__Page__Group__13__Impl"


    // $ANTLR start "rule__Page__Group__14"
    // InternalMyDsl.g:742:1: rule__Page__Group__14 : rule__Page__Group__14__Impl rule__Page__Group__15 ;
    public final void rule__Page__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__Page__Group__14__Impl rule__Page__Group__15 )
            // InternalMyDsl.g:747:2: rule__Page__Group__14__Impl rule__Page__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Page__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__15();

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
    // $ANTLR end "rule__Page__Group__14"


    // $ANTLR start "rule__Page__Group__14__Impl"
    // InternalMyDsl.g:754:1: rule__Page__Group__14__Impl : ( ( rule__Page__Nb_PersAssignment_14 ) ) ;
    public final void rule__Page__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( ( rule__Page__Nb_PersAssignment_14 ) ) )
            // InternalMyDsl.g:759:1: ( ( rule__Page__Nb_PersAssignment_14 ) )
            {
            // InternalMyDsl.g:759:1: ( ( rule__Page__Nb_PersAssignment_14 ) )
            // InternalMyDsl.g:760:2: ( rule__Page__Nb_PersAssignment_14 )
            {
             before(grammarAccess.getPageAccess().getNb_PersAssignment_14()); 
            // InternalMyDsl.g:761:2: ( rule__Page__Nb_PersAssignment_14 )
            // InternalMyDsl.g:761:3: rule__Page__Nb_PersAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Page__Nb_PersAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNb_PersAssignment_14()); 

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
    // $ANTLR end "rule__Page__Group__14__Impl"


    // $ANTLR start "rule__Page__Group__15"
    // InternalMyDsl.g:769:1: rule__Page__Group__15 : rule__Page__Group__15__Impl rule__Page__Group__16 ;
    public final void rule__Page__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__Page__Group__15__Impl rule__Page__Group__16 )
            // InternalMyDsl.g:774:2: rule__Page__Group__15__Impl rule__Page__Group__16
            {
            pushFollow(FOLLOW_13);
            rule__Page__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__16();

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
    // $ANTLR end "rule__Page__Group__15"


    // $ANTLR start "rule__Page__Group__15__Impl"
    // InternalMyDsl.g:781:1: rule__Page__Group__15__Impl : ( 'menu' ) ;
    public final void rule__Page__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( ( 'menu' ) )
            // InternalMyDsl.g:786:1: ( 'menu' )
            {
            // InternalMyDsl.g:786:1: ( 'menu' )
            // InternalMyDsl.g:787:2: 'menu'
            {
             before(grammarAccess.getPageAccess().getMenuKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getMenuKeyword_15()); 

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
    // $ANTLR end "rule__Page__Group__15__Impl"


    // $ANTLR start "rule__Page__Group__16"
    // InternalMyDsl.g:796:1: rule__Page__Group__16 : rule__Page__Group__16__Impl rule__Page__Group__17 ;
    public final void rule__Page__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Page__Group__16__Impl rule__Page__Group__17 )
            // InternalMyDsl.g:801:2: rule__Page__Group__16__Impl rule__Page__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__Page__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__17();

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
    // $ANTLR end "rule__Page__Group__16"


    // $ANTLR start "rule__Page__Group__16__Impl"
    // InternalMyDsl.g:808:1: rule__Page__Group__16__Impl : ( ( rule__Page__MenuAssignment_16 ) ) ;
    public final void rule__Page__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( ( rule__Page__MenuAssignment_16 ) ) )
            // InternalMyDsl.g:813:1: ( ( rule__Page__MenuAssignment_16 ) )
            {
            // InternalMyDsl.g:813:1: ( ( rule__Page__MenuAssignment_16 ) )
            // InternalMyDsl.g:814:2: ( rule__Page__MenuAssignment_16 )
            {
             before(grammarAccess.getPageAccess().getMenuAssignment_16()); 
            // InternalMyDsl.g:815:2: ( rule__Page__MenuAssignment_16 )
            // InternalMyDsl.g:815:3: rule__Page__MenuAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Page__MenuAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getMenuAssignment_16()); 

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
    // $ANTLR end "rule__Page__Group__16__Impl"


    // $ANTLR start "rule__Page__Group__17"
    // InternalMyDsl.g:823:1: rule__Page__Group__17 : rule__Page__Group__17__Impl rule__Page__Group__18 ;
    public final void rule__Page__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Page__Group__17__Impl rule__Page__Group__18 )
            // InternalMyDsl.g:828:2: rule__Page__Group__17__Impl rule__Page__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Page__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__18();

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
    // $ANTLR end "rule__Page__Group__17"


    // $ANTLR start "rule__Page__Group__17__Impl"
    // InternalMyDsl.g:835:1: rule__Page__Group__17__Impl : ( 'Selection' ) ;
    public final void rule__Page__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( 'Selection' ) )
            // InternalMyDsl.g:840:1: ( 'Selection' )
            {
            // InternalMyDsl.g:840:1: ( 'Selection' )
            // InternalMyDsl.g:841:2: 'Selection'
            {
             before(grammarAccess.getPageAccess().getSelectionKeyword_17()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getSelectionKeyword_17()); 

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
    // $ANTLR end "rule__Page__Group__17__Impl"


    // $ANTLR start "rule__Page__Group__18"
    // InternalMyDsl.g:850:1: rule__Page__Group__18 : rule__Page__Group__18__Impl rule__Page__Group__19 ;
    public final void rule__Page__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Page__Group__18__Impl rule__Page__Group__19 )
            // InternalMyDsl.g:855:2: rule__Page__Group__18__Impl rule__Page__Group__19
            {
            pushFollow(FOLLOW_16);
            rule__Page__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__19();

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
    // $ANTLR end "rule__Page__Group__18"


    // $ANTLR start "rule__Page__Group__18__Impl"
    // InternalMyDsl.g:862:1: rule__Page__Group__18__Impl : ( ( rule__Page__SelectionAssignment_18 ) ) ;
    public final void rule__Page__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( ( rule__Page__SelectionAssignment_18 ) ) )
            // InternalMyDsl.g:867:1: ( ( rule__Page__SelectionAssignment_18 ) )
            {
            // InternalMyDsl.g:867:1: ( ( rule__Page__SelectionAssignment_18 ) )
            // InternalMyDsl.g:868:2: ( rule__Page__SelectionAssignment_18 )
            {
             before(grammarAccess.getPageAccess().getSelectionAssignment_18()); 
            // InternalMyDsl.g:869:2: ( rule__Page__SelectionAssignment_18 )
            // InternalMyDsl.g:869:3: rule__Page__SelectionAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Page__SelectionAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getSelectionAssignment_18()); 

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
    // $ANTLR end "rule__Page__Group__18__Impl"


    // $ANTLR start "rule__Page__Group__19"
    // InternalMyDsl.g:877:1: rule__Page__Group__19 : rule__Page__Group__19__Impl rule__Page__Group__20 ;
    public final void rule__Page__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Page__Group__19__Impl rule__Page__Group__20 )
            // InternalMyDsl.g:882:2: rule__Page__Group__19__Impl rule__Page__Group__20
            {
            pushFollow(FOLLOW_17);
            rule__Page__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__20();

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
    // $ANTLR end "rule__Page__Group__19"


    // $ANTLR start "rule__Page__Group__19__Impl"
    // InternalMyDsl.g:889:1: rule__Page__Group__19__Impl : ( 'presentation' ) ;
    public final void rule__Page__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( 'presentation' ) )
            // InternalMyDsl.g:894:1: ( 'presentation' )
            {
            // InternalMyDsl.g:894:1: ( 'presentation' )
            // InternalMyDsl.g:895:2: 'presentation'
            {
             before(grammarAccess.getPageAccess().getPresentationKeyword_19()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPresentationKeyword_19()); 

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
    // $ANTLR end "rule__Page__Group__19__Impl"


    // $ANTLR start "rule__Page__Group__20"
    // InternalMyDsl.g:904:1: rule__Page__Group__20 : rule__Page__Group__20__Impl rule__Page__Group__21 ;
    public final void rule__Page__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__Page__Group__20__Impl rule__Page__Group__21 )
            // InternalMyDsl.g:909:2: rule__Page__Group__20__Impl rule__Page__Group__21
            {
            pushFollow(FOLLOW_18);
            rule__Page__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__21();

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
    // $ANTLR end "rule__Page__Group__20"


    // $ANTLR start "rule__Page__Group__20__Impl"
    // InternalMyDsl.g:916:1: rule__Page__Group__20__Impl : ( ( rule__Page__PresentationAssignment_20 ) ) ;
    public final void rule__Page__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__Page__PresentationAssignment_20 ) ) )
            // InternalMyDsl.g:921:1: ( ( rule__Page__PresentationAssignment_20 ) )
            {
            // InternalMyDsl.g:921:1: ( ( rule__Page__PresentationAssignment_20 ) )
            // InternalMyDsl.g:922:2: ( rule__Page__PresentationAssignment_20 )
            {
             before(grammarAccess.getPageAccess().getPresentationAssignment_20()); 
            // InternalMyDsl.g:923:2: ( rule__Page__PresentationAssignment_20 )
            // InternalMyDsl.g:923:3: rule__Page__PresentationAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Page__PresentationAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getPresentationAssignment_20()); 

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
    // $ANTLR end "rule__Page__Group__20__Impl"


    // $ANTLR start "rule__Page__Group__21"
    // InternalMyDsl.g:931:1: rule__Page__Group__21 : rule__Page__Group__21__Impl rule__Page__Group__22 ;
    public final void rule__Page__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__Page__Group__21__Impl rule__Page__Group__22 )
            // InternalMyDsl.g:936:2: rule__Page__Group__21__Impl rule__Page__Group__22
            {
            pushFollow(FOLLOW_19);
            rule__Page__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__22();

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
    // $ANTLR end "rule__Page__Group__21"


    // $ANTLR start "rule__Page__Group__21__Impl"
    // InternalMyDsl.g:943:1: rule__Page__Group__21__Impl : ( 'logo' ) ;
    public final void rule__Page__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( 'logo' ) )
            // InternalMyDsl.g:948:1: ( 'logo' )
            {
            // InternalMyDsl.g:948:1: ( 'logo' )
            // InternalMyDsl.g:949:2: 'logo'
            {
             before(grammarAccess.getPageAccess().getLogoKeyword_21()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLogoKeyword_21()); 

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
    // $ANTLR end "rule__Page__Group__21__Impl"


    // $ANTLR start "rule__Page__Group__22"
    // InternalMyDsl.g:958:1: rule__Page__Group__22 : rule__Page__Group__22__Impl rule__Page__Group__23 ;
    public final void rule__Page__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__Page__Group__22__Impl rule__Page__Group__23 )
            // InternalMyDsl.g:963:2: rule__Page__Group__22__Impl rule__Page__Group__23
            {
            pushFollow(FOLLOW_20);
            rule__Page__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__23();

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
    // $ANTLR end "rule__Page__Group__22"


    // $ANTLR start "rule__Page__Group__22__Impl"
    // InternalMyDsl.g:970:1: rule__Page__Group__22__Impl : ( ( rule__Page__LogoAssignment_22 ) ) ;
    public final void rule__Page__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( ( rule__Page__LogoAssignment_22 ) ) )
            // InternalMyDsl.g:975:1: ( ( rule__Page__LogoAssignment_22 ) )
            {
            // InternalMyDsl.g:975:1: ( ( rule__Page__LogoAssignment_22 ) )
            // InternalMyDsl.g:976:2: ( rule__Page__LogoAssignment_22 )
            {
             before(grammarAccess.getPageAccess().getLogoAssignment_22()); 
            // InternalMyDsl.g:977:2: ( rule__Page__LogoAssignment_22 )
            // InternalMyDsl.g:977:3: rule__Page__LogoAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Page__LogoAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getLogoAssignment_22()); 

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
    // $ANTLR end "rule__Page__Group__22__Impl"


    // $ANTLR start "rule__Page__Group__23"
    // InternalMyDsl.g:985:1: rule__Page__Group__23 : rule__Page__Group__23__Impl rule__Page__Group__24 ;
    public final void rule__Page__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Page__Group__23__Impl rule__Page__Group__24 )
            // InternalMyDsl.g:990:2: rule__Page__Group__23__Impl rule__Page__Group__24
            {
            pushFollow(FOLLOW_21);
            rule__Page__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__24();

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
    // $ANTLR end "rule__Page__Group__23"


    // $ANTLR start "rule__Page__Group__23__Impl"
    // InternalMyDsl.g:997:1: rule__Page__Group__23__Impl : ( 'source' ) ;
    public final void rule__Page__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( ( 'source' ) )
            // InternalMyDsl.g:1002:1: ( 'source' )
            {
            // InternalMyDsl.g:1002:1: ( 'source' )
            // InternalMyDsl.g:1003:2: 'source'
            {
             before(grammarAccess.getPageAccess().getSourceKeyword_23()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getSourceKeyword_23()); 

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
    // $ANTLR end "rule__Page__Group__23__Impl"


    // $ANTLR start "rule__Page__Group__24"
    // InternalMyDsl.g:1012:1: rule__Page__Group__24 : rule__Page__Group__24__Impl rule__Page__Group__25 ;
    public final void rule__Page__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__Page__Group__24__Impl rule__Page__Group__25 )
            // InternalMyDsl.g:1017:2: rule__Page__Group__24__Impl rule__Page__Group__25
            {
            pushFollow(FOLLOW_22);
            rule__Page__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__25();

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
    // $ANTLR end "rule__Page__Group__24"


    // $ANTLR start "rule__Page__Group__24__Impl"
    // InternalMyDsl.g:1024:1: rule__Page__Group__24__Impl : ( ( rule__Page__SourceAssignment_24 ) ) ;
    public final void rule__Page__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( ( rule__Page__SourceAssignment_24 ) ) )
            // InternalMyDsl.g:1029:1: ( ( rule__Page__SourceAssignment_24 ) )
            {
            // InternalMyDsl.g:1029:1: ( ( rule__Page__SourceAssignment_24 ) )
            // InternalMyDsl.g:1030:2: ( rule__Page__SourceAssignment_24 )
            {
             before(grammarAccess.getPageAccess().getSourceAssignment_24()); 
            // InternalMyDsl.g:1031:2: ( rule__Page__SourceAssignment_24 )
            // InternalMyDsl.g:1031:3: rule__Page__SourceAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Page__SourceAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getSourceAssignment_24()); 

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
    // $ANTLR end "rule__Page__Group__24__Impl"


    // $ANTLR start "rule__Page__Group__25"
    // InternalMyDsl.g:1039:1: rule__Page__Group__25 : rule__Page__Group__25__Impl rule__Page__Group__26 ;
    public final void rule__Page__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__Page__Group__25__Impl rule__Page__Group__26 )
            // InternalMyDsl.g:1044:2: rule__Page__Group__25__Impl rule__Page__Group__26
            {
            pushFollow(FOLLOW_22);
            rule__Page__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__26();

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
    // $ANTLR end "rule__Page__Group__25"


    // $ANTLR start "rule__Page__Group__25__Impl"
    // InternalMyDsl.g:1051:1: rule__Page__Group__25__Impl : ( ( rule__Page__Group_25__0 )* ) ;
    public final void rule__Page__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( ( rule__Page__Group_25__0 )* ) )
            // InternalMyDsl.g:1056:1: ( ( rule__Page__Group_25__0 )* )
            {
            // InternalMyDsl.g:1056:1: ( ( rule__Page__Group_25__0 )* )
            // InternalMyDsl.g:1057:2: ( rule__Page__Group_25__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_25()); 
            // InternalMyDsl.g:1058:2: ( rule__Page__Group_25__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1058:3: rule__Page__Group_25__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Page__Group_25__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getGroup_25()); 

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
    // $ANTLR end "rule__Page__Group__25__Impl"


    // $ANTLR start "rule__Page__Group__26"
    // InternalMyDsl.g:1066:1: rule__Page__Group__26 : rule__Page__Group__26__Impl rule__Page__Group__27 ;
    public final void rule__Page__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__Page__Group__26__Impl rule__Page__Group__27 )
            // InternalMyDsl.g:1071:2: rule__Page__Group__26__Impl rule__Page__Group__27
            {
            pushFollow(FOLLOW_22);
            rule__Page__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__27();

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
    // $ANTLR end "rule__Page__Group__26"


    // $ANTLR start "rule__Page__Group__26__Impl"
    // InternalMyDsl.g:1078:1: rule__Page__Group__26__Impl : ( ( rule__Page__Group_26__0 )? ) ;
    public final void rule__Page__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( ( rule__Page__Group_26__0 )? ) )
            // InternalMyDsl.g:1083:1: ( ( rule__Page__Group_26__0 )? )
            {
            // InternalMyDsl.g:1083:1: ( ( rule__Page__Group_26__0 )? )
            // InternalMyDsl.g:1084:2: ( rule__Page__Group_26__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_26()); 
            // InternalMyDsl.g:1085:2: ( rule__Page__Group_26__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1085:3: rule__Page__Group_26__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_26__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_26()); 

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
    // $ANTLR end "rule__Page__Group__26__Impl"


    // $ANTLR start "rule__Page__Group__27"
    // InternalMyDsl.g:1093:1: rule__Page__Group__27 : rule__Page__Group__27__Impl ;
    public final void rule__Page__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__Page__Group__27__Impl )
            // InternalMyDsl.g:1098:2: rule__Page__Group__27__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__27__Impl();

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
    // $ANTLR end "rule__Page__Group__27"


    // $ANTLR start "rule__Page__Group__27__Impl"
    // InternalMyDsl.g:1104:1: rule__Page__Group__27__Impl : ( ( rule__Page__Group_27__0 )? ) ;
    public final void rule__Page__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( ( rule__Page__Group_27__0 )? ) )
            // InternalMyDsl.g:1109:1: ( ( rule__Page__Group_27__0 )? )
            {
            // InternalMyDsl.g:1109:1: ( ( rule__Page__Group_27__0 )? )
            // InternalMyDsl.g:1110:2: ( rule__Page__Group_27__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_27()); 
            // InternalMyDsl.g:1111:2: ( rule__Page__Group_27__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1111:3: rule__Page__Group_27__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_27__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_27()); 

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
    // $ANTLR end "rule__Page__Group__27__Impl"


    // $ANTLR start "rule__Page__Group_25__0"
    // InternalMyDsl.g:1120:1: rule__Page__Group_25__0 : rule__Page__Group_25__0__Impl rule__Page__Group_25__1 ;
    public final void rule__Page__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__Page__Group_25__0__Impl rule__Page__Group_25__1 )
            // InternalMyDsl.g:1125:2: rule__Page__Group_25__0__Impl rule__Page__Group_25__1
            {
            pushFollow(FOLLOW_21);
            rule__Page__Group_25__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_25__1();

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
    // $ANTLR end "rule__Page__Group_25__0"


    // $ANTLR start "rule__Page__Group_25__0__Impl"
    // InternalMyDsl.g:1132:1: rule__Page__Group_25__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ',' ) )
            // InternalMyDsl.g:1137:1: ( ',' )
            {
            // InternalMyDsl.g:1137:1: ( ',' )
            // InternalMyDsl.g:1138:2: ','
            {
             before(grammarAccess.getPageAccess().getCommaKeyword_25_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getCommaKeyword_25_0()); 

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
    // $ANTLR end "rule__Page__Group_25__0__Impl"


    // $ANTLR start "rule__Page__Group_25__1"
    // InternalMyDsl.g:1147:1: rule__Page__Group_25__1 : rule__Page__Group_25__1__Impl ;
    public final void rule__Page__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__Page__Group_25__1__Impl )
            // InternalMyDsl.g:1152:2: rule__Page__Group_25__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_25__1__Impl();

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
    // $ANTLR end "rule__Page__Group_25__1"


    // $ANTLR start "rule__Page__Group_25__1__Impl"
    // InternalMyDsl.g:1158:1: rule__Page__Group_25__1__Impl : ( ( rule__Page__SourceAssignment_25_1 ) ) ;
    public final void rule__Page__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ( rule__Page__SourceAssignment_25_1 ) ) )
            // InternalMyDsl.g:1163:1: ( ( rule__Page__SourceAssignment_25_1 ) )
            {
            // InternalMyDsl.g:1163:1: ( ( rule__Page__SourceAssignment_25_1 ) )
            // InternalMyDsl.g:1164:2: ( rule__Page__SourceAssignment_25_1 )
            {
             before(grammarAccess.getPageAccess().getSourceAssignment_25_1()); 
            // InternalMyDsl.g:1165:2: ( rule__Page__SourceAssignment_25_1 )
            // InternalMyDsl.g:1165:3: rule__Page__SourceAssignment_25_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__SourceAssignment_25_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getSourceAssignment_25_1()); 

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
    // $ANTLR end "rule__Page__Group_25__1__Impl"


    // $ANTLR start "rule__Page__Group_26__0"
    // InternalMyDsl.g:1174:1: rule__Page__Group_26__0 : rule__Page__Group_26__0__Impl rule__Page__Group_26__1 ;
    public final void rule__Page__Group_26__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__Page__Group_26__0__Impl rule__Page__Group_26__1 )
            // InternalMyDsl.g:1179:2: rule__Page__Group_26__0__Impl rule__Page__Group_26__1
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group_26__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_26__1();

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
    // $ANTLR end "rule__Page__Group_26__0"


    // $ANTLR start "rule__Page__Group_26__0__Impl"
    // InternalMyDsl.g:1186:1: rule__Page__Group_26__0__Impl : ( 'Port_back' ) ;
    public final void rule__Page__Group_26__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( 'Port_back' ) )
            // InternalMyDsl.g:1191:1: ( 'Port_back' )
            {
            // InternalMyDsl.g:1191:1: ( 'Port_back' )
            // InternalMyDsl.g:1192:2: 'Port_back'
            {
             before(grammarAccess.getPageAccess().getPort_backKeyword_26_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPort_backKeyword_26_0()); 

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
    // $ANTLR end "rule__Page__Group_26__0__Impl"


    // $ANTLR start "rule__Page__Group_26__1"
    // InternalMyDsl.g:1201:1: rule__Page__Group_26__1 : rule__Page__Group_26__1__Impl ;
    public final void rule__Page__Group_26__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__Page__Group_26__1__Impl )
            // InternalMyDsl.g:1206:2: rule__Page__Group_26__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_26__1__Impl();

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
    // $ANTLR end "rule__Page__Group_26__1"


    // $ANTLR start "rule__Page__Group_26__1__Impl"
    // InternalMyDsl.g:1212:1: rule__Page__Group_26__1__Impl : ( ( rule__Page__Port_backAssignment_26_1 ) ) ;
    public final void rule__Page__Group_26__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( ( rule__Page__Port_backAssignment_26_1 ) ) )
            // InternalMyDsl.g:1217:1: ( ( rule__Page__Port_backAssignment_26_1 ) )
            {
            // InternalMyDsl.g:1217:1: ( ( rule__Page__Port_backAssignment_26_1 ) )
            // InternalMyDsl.g:1218:2: ( rule__Page__Port_backAssignment_26_1 )
            {
             before(grammarAccess.getPageAccess().getPort_backAssignment_26_1()); 
            // InternalMyDsl.g:1219:2: ( rule__Page__Port_backAssignment_26_1 )
            // InternalMyDsl.g:1219:3: rule__Page__Port_backAssignment_26_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__Port_backAssignment_26_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getPort_backAssignment_26_1()); 

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
    // $ANTLR end "rule__Page__Group_26__1__Impl"


    // $ANTLR start "rule__Page__Group_27__0"
    // InternalMyDsl.g:1228:1: rule__Page__Group_27__0 : rule__Page__Group_27__0__Impl rule__Page__Group_27__1 ;
    public final void rule__Page__Group_27__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__Page__Group_27__0__Impl rule__Page__Group_27__1 )
            // InternalMyDsl.g:1233:2: rule__Page__Group_27__0__Impl rule__Page__Group_27__1
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group_27__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_27__1();

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
    // $ANTLR end "rule__Page__Group_27__0"


    // $ANTLR start "rule__Page__Group_27__0__Impl"
    // InternalMyDsl.g:1240:1: rule__Page__Group_27__0__Impl : ( 'Port_front' ) ;
    public final void rule__Page__Group_27__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( ( 'Port_front' ) )
            // InternalMyDsl.g:1245:1: ( 'Port_front' )
            {
            // InternalMyDsl.g:1245:1: ( 'Port_front' )
            // InternalMyDsl.g:1246:2: 'Port_front'
            {
             before(grammarAccess.getPageAccess().getPort_frontKeyword_27_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPort_frontKeyword_27_0()); 

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
    // $ANTLR end "rule__Page__Group_27__0__Impl"


    // $ANTLR start "rule__Page__Group_27__1"
    // InternalMyDsl.g:1255:1: rule__Page__Group_27__1 : rule__Page__Group_27__1__Impl ;
    public final void rule__Page__Group_27__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__Page__Group_27__1__Impl )
            // InternalMyDsl.g:1260:2: rule__Page__Group_27__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_27__1__Impl();

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
    // $ANTLR end "rule__Page__Group_27__1"


    // $ANTLR start "rule__Page__Group_27__1__Impl"
    // InternalMyDsl.g:1266:1: rule__Page__Group_27__1__Impl : ( ( rule__Page__Port_frontAssignment_27_1 ) ) ;
    public final void rule__Page__Group_27__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( rule__Page__Port_frontAssignment_27_1 ) ) )
            // InternalMyDsl.g:1271:1: ( ( rule__Page__Port_frontAssignment_27_1 ) )
            {
            // InternalMyDsl.g:1271:1: ( ( rule__Page__Port_frontAssignment_27_1 ) )
            // InternalMyDsl.g:1272:2: ( rule__Page__Port_frontAssignment_27_1 )
            {
             before(grammarAccess.getPageAccess().getPort_frontAssignment_27_1()); 
            // InternalMyDsl.g:1273:2: ( rule__Page__Port_frontAssignment_27_1 )
            // InternalMyDsl.g:1273:3: rule__Page__Port_frontAssignment_27_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__Port_frontAssignment_27_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getPort_frontAssignment_27_1()); 

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
    // $ANTLR end "rule__Page__Group_27__1__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalMyDsl.g:1282:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalMyDsl.g:1287:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1294:1: rule__Source__Group__0__Impl : ( () ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( () ) )
            // InternalMyDsl.g:1299:1: ( () )
            {
            // InternalMyDsl.g:1299:1: ( () )
            // InternalMyDsl.g:1300:2: ()
            {
             before(grammarAccess.getSourceAccess().getSourceAction_0()); 
            // InternalMyDsl.g:1301:2: ()
            // InternalMyDsl.g:1301:3: 
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
    // InternalMyDsl.g:1309:1: rule__Source__Group__1 : rule__Source__Group__1__Impl ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__Source__Group__1__Impl )
            // InternalMyDsl.g:1314:2: rule__Source__Group__1__Impl
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
    // InternalMyDsl.g:1320:1: rule__Source__Group__1__Impl : ( ( rule__Source__NameAssignment_1 )? ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( ( ( rule__Source__NameAssignment_1 )? ) )
            // InternalMyDsl.g:1325:1: ( ( rule__Source__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:1325:1: ( ( rule__Source__NameAssignment_1 )? )
            // InternalMyDsl.g:1326:2: ( rule__Source__NameAssignment_1 )?
            {
             before(grammarAccess.getSourceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1327:2: ( rule__Source__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=20 && LA11_0<=21)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1327:3: rule__Source__NameAssignment_1
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1336:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1341:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:1348:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1353:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1353:1: ( ( '-' )? )
            // InternalMyDsl.g:1354:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1355:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1355:3: '-'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:1363:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1368:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:1374:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1379:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1379:1: ( RULE_INT )
            // InternalMyDsl.g:1380:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Page__GeolocalisationAssignment_0"
    // InternalMyDsl.g:1390:1: rule__Page__GeolocalisationAssignment_0 : ( ( 'geolocalisation' ) ) ;
    public final void rule__Page__GeolocalisationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( ( 'geolocalisation' ) ) )
            // InternalMyDsl.g:1395:2: ( ( 'geolocalisation' ) )
            {
            // InternalMyDsl.g:1395:2: ( ( 'geolocalisation' ) )
            // InternalMyDsl.g:1396:3: ( 'geolocalisation' )
            {
             before(grammarAccess.getPageAccess().getGeolocalisationGeolocalisationKeyword_0_0()); 
            // InternalMyDsl.g:1397:3: ( 'geolocalisation' )
            // InternalMyDsl.g:1398:4: 'geolocalisation'
            {
             before(grammarAccess.getPageAccess().getGeolocalisationGeolocalisationKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getGeolocalisationGeolocalisationKeyword_0_0()); 

            }

             after(grammarAccess.getPageAccess().getGeolocalisationGeolocalisationKeyword_0_0()); 

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
    // $ANTLR end "rule__Page__GeolocalisationAssignment_0"


    // $ANTLR start "rule__Page__NameAssignment_2"
    // InternalMyDsl.g:1409:1: rule__Page__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1414:2: ( ruleEString )
            {
            // InternalMyDsl.g:1414:2: ( ruleEString )
            // InternalMyDsl.g:1415:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Page__NameAssignment_2"


    // $ANTLR start "rule__Page__DescriptionAssignment_4"
    // InternalMyDsl.g:1424:1: rule__Page__DescriptionAssignment_4 : ( ruleEString ) ;
    public final void rule__Page__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1429:2: ( ruleEString )
            {
            // InternalMyDsl.g:1429:2: ( ruleEString )
            // InternalMyDsl.g:1430:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getDescriptionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getDescriptionEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Page__DescriptionAssignment_4"


    // $ANTLR start "rule__Page__MailAssignment_6"
    // InternalMyDsl.g:1439:1: rule__Page__MailAssignment_6 : ( ruleEString ) ;
    public final void rule__Page__MailAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1444:2: ( ruleEString )
            {
            // InternalMyDsl.g:1444:2: ( ruleEString )
            // InternalMyDsl.g:1445:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getMailEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getMailEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Page__MailAssignment_6"


    // $ANTLR start "rule__Page__TelephoneAssignment_8"
    // InternalMyDsl.g:1454:1: rule__Page__TelephoneAssignment_8 : ( ruleEString ) ;
    public final void rule__Page__TelephoneAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1459:2: ( ruleEString )
            {
            // InternalMyDsl.g:1459:2: ( ruleEString )
            // InternalMyDsl.g:1460:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getTelephoneEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getTelephoneEStringParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Page__TelephoneAssignment_8"


    // $ANTLR start "rule__Page__Heure_ouvertureAssignment_10"
    // InternalMyDsl.g:1469:1: rule__Page__Heure_ouvertureAssignment_10 : ( ruleEInt ) ;
    public final void rule__Page__Heure_ouvertureAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1474:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1474:2: ( ruleEInt )
            // InternalMyDsl.g:1475:3: ruleEInt
            {
             before(grammarAccess.getPageAccess().getHeure_ouvertureEIntParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPageAccess().getHeure_ouvertureEIntParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Page__Heure_ouvertureAssignment_10"


    // $ANTLR start "rule__Page__Heure_fermetureAssignment_12"
    // InternalMyDsl.g:1484:1: rule__Page__Heure_fermetureAssignment_12 : ( ruleEInt ) ;
    public final void rule__Page__Heure_fermetureAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1489:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1489:2: ( ruleEInt )
            // InternalMyDsl.g:1490:3: ruleEInt
            {
             before(grammarAccess.getPageAccess().getHeure_fermetureEIntParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPageAccess().getHeure_fermetureEIntParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Page__Heure_fermetureAssignment_12"


    // $ANTLR start "rule__Page__Nb_PersAssignment_14"
    // InternalMyDsl.g:1499:1: rule__Page__Nb_PersAssignment_14 : ( ruleEInt ) ;
    public final void rule__Page__Nb_PersAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1504:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1504:2: ( ruleEInt )
            // InternalMyDsl.g:1505:3: ruleEInt
            {
             before(grammarAccess.getPageAccess().getNb_PersEIntParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNb_PersEIntParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Page__Nb_PersAssignment_14"


    // $ANTLR start "rule__Page__MenuAssignment_16"
    // InternalMyDsl.g:1514:1: rule__Page__MenuAssignment_16 : ( ruleSourceMenu ) ;
    public final void rule__Page__MenuAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( ( ruleSourceMenu ) )
            // InternalMyDsl.g:1519:2: ( ruleSourceMenu )
            {
            // InternalMyDsl.g:1519:2: ( ruleSourceMenu )
            // InternalMyDsl.g:1520:3: ruleSourceMenu
            {
             before(grammarAccess.getPageAccess().getMenuSourceMenuEnumRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceMenu();

            state._fsp--;

             after(grammarAccess.getPageAccess().getMenuSourceMenuEnumRuleCall_16_0()); 

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
    // $ANTLR end "rule__Page__MenuAssignment_16"


    // $ANTLR start "rule__Page__SelectionAssignment_18"
    // InternalMyDsl.g:1529:1: rule__Page__SelectionAssignment_18 : ( ruleSourceSelection ) ;
    public final void rule__Page__SelectionAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( ruleSourceSelection ) )
            // InternalMyDsl.g:1534:2: ( ruleSourceSelection )
            {
            // InternalMyDsl.g:1534:2: ( ruleSourceSelection )
            // InternalMyDsl.g:1535:3: ruleSourceSelection
            {
             before(grammarAccess.getPageAccess().getSelectionSourceSelectionEnumRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceSelection();

            state._fsp--;

             after(grammarAccess.getPageAccess().getSelectionSourceSelectionEnumRuleCall_18_0()); 

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
    // $ANTLR end "rule__Page__SelectionAssignment_18"


    // $ANTLR start "rule__Page__PresentationAssignment_20"
    // InternalMyDsl.g:1544:1: rule__Page__PresentationAssignment_20 : ( ruleSourcePres ) ;
    public final void rule__Page__PresentationAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( ruleSourcePres ) )
            // InternalMyDsl.g:1549:2: ( ruleSourcePres )
            {
            // InternalMyDsl.g:1549:2: ( ruleSourcePres )
            // InternalMyDsl.g:1550:3: ruleSourcePres
            {
             before(grammarAccess.getPageAccess().getPresentationSourcePresEnumRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleSourcePres();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPresentationSourcePresEnumRuleCall_20_0()); 

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
    // $ANTLR end "rule__Page__PresentationAssignment_20"


    // $ANTLR start "rule__Page__LogoAssignment_22"
    // InternalMyDsl.g:1559:1: rule__Page__LogoAssignment_22 : ( ruleSourceLogo ) ;
    public final void rule__Page__LogoAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( ( ruleSourceLogo ) )
            // InternalMyDsl.g:1564:2: ( ruleSourceLogo )
            {
            // InternalMyDsl.g:1564:2: ( ruleSourceLogo )
            // InternalMyDsl.g:1565:3: ruleSourceLogo
            {
             before(grammarAccess.getPageAccess().getLogoSourceLogoEnumRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceLogo();

            state._fsp--;

             after(grammarAccess.getPageAccess().getLogoSourceLogoEnumRuleCall_22_0()); 

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
    // $ANTLR end "rule__Page__LogoAssignment_22"


    // $ANTLR start "rule__Page__SourceAssignment_24"
    // InternalMyDsl.g:1574:1: rule__Page__SourceAssignment_24 : ( ruleSource ) ;
    public final void rule__Page__SourceAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1578:1: ( ( ruleSource ) )
            // InternalMyDsl.g:1579:2: ( ruleSource )
            {
            // InternalMyDsl.g:1579:2: ( ruleSource )
            // InternalMyDsl.g:1580:3: ruleSource
            {
             before(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_24_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_24_0()); 

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
    // $ANTLR end "rule__Page__SourceAssignment_24"


    // $ANTLR start "rule__Page__SourceAssignment_25_1"
    // InternalMyDsl.g:1589:1: rule__Page__SourceAssignment_25_1 : ( ruleSource ) ;
    public final void rule__Page__SourceAssignment_25_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ruleSource ) )
            // InternalMyDsl.g:1594:2: ( ruleSource )
            {
            // InternalMyDsl.g:1594:2: ( ruleSource )
            // InternalMyDsl.g:1595:3: ruleSource
            {
             before(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_25_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getPageAccess().getSourceSourceParserRuleCall_25_1_0()); 

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
    // $ANTLR end "rule__Page__SourceAssignment_25_1"


    // $ANTLR start "rule__Page__Port_backAssignment_26_1"
    // InternalMyDsl.g:1604:1: rule__Page__Port_backAssignment_26_1 : ( ruleEInt ) ;
    public final void rule__Page__Port_backAssignment_26_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1609:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1609:2: ( ruleEInt )
            // InternalMyDsl.g:1610:3: ruleEInt
            {
             before(grammarAccess.getPageAccess().getPort_backEIntParserRuleCall_26_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPort_backEIntParserRuleCall_26_1_0()); 

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
    // $ANTLR end "rule__Page__Port_backAssignment_26_1"


    // $ANTLR start "rule__Page__Port_frontAssignment_27_1"
    // InternalMyDsl.g:1619:1: rule__Page__Port_frontAssignment_27_1 : ( ruleEInt ) ;
    public final void rule__Page__Port_frontAssignment_27_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1624:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1624:2: ( ruleEInt )
            // InternalMyDsl.g:1625:3: ruleEInt
            {
             before(grammarAccess.getPageAccess().getPort_frontEIntParserRuleCall_27_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPort_frontEIntParserRuleCall_27_1_0()); 

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
    // $ANTLR end "rule__Page__Port_frontAssignment_27_1"


    // $ANTLR start "rule__Source__NameAssignment_1"
    // InternalMyDsl.g:1634:1: rule__Source__NameAssignment_1 : ( ruleSourceName ) ;
    public final void rule__Source__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( ruleSourceName ) )
            // InternalMyDsl.g:1639:2: ( ruleSourceName )
            {
            // InternalMyDsl.g:1639:2: ( ruleSourceName )
            // InternalMyDsl.g:1640:3: ruleSourceName
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000002L});

}