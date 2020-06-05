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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SideBar'", "'NavBar'", "'basique'", "'card'", "'comute'", "'rdv'", "'trajet'", "'Tisseo'", "'GoogleMap'", "'Page'", "'description'", "'mail'", "'telephone'", "'heure_ouverture'", "'heure_fermeture'", "'nb_Pers'", "'menu'", "'presentation'", "'logo'", "'source'", "'Port_back'", "'Port_front'", "','", "'geolocalisation'"
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


    // $ANTLR start "ruleSourceMenu"
    // InternalMyDsl.g:128:1: ruleSourceMenu : ( ( rule__SourceMenu__Alternatives ) ) ;
    public final void ruleSourceMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:132:1: ( ( ( rule__SourceMenu__Alternatives ) ) )
            // InternalMyDsl.g:133:2: ( ( rule__SourceMenu__Alternatives ) )
            {
            // InternalMyDsl.g:133:2: ( ( rule__SourceMenu__Alternatives ) )
            // InternalMyDsl.g:134:3: ( rule__SourceMenu__Alternatives )
            {
             before(grammarAccess.getSourceMenuAccess().getAlternatives()); 
            // InternalMyDsl.g:135:3: ( rule__SourceMenu__Alternatives )
            // InternalMyDsl.g:135:4: rule__SourceMenu__Alternatives
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


    // $ANTLR start "ruleSourcePres"
    // InternalMyDsl.g:144:1: ruleSourcePres : ( ( rule__SourcePres__Alternatives ) ) ;
    public final void ruleSourcePres() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:148:1: ( ( ( rule__SourcePres__Alternatives ) ) )
            // InternalMyDsl.g:149:2: ( ( rule__SourcePres__Alternatives ) )
            {
            // InternalMyDsl.g:149:2: ( ( rule__SourcePres__Alternatives ) )
            // InternalMyDsl.g:150:3: ( rule__SourcePres__Alternatives )
            {
             before(grammarAccess.getSourcePresAccess().getAlternatives()); 
            // InternalMyDsl.g:151:3: ( rule__SourcePres__Alternatives )
            // InternalMyDsl.g:151:4: rule__SourcePres__Alternatives
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
    // InternalMyDsl.g:160:1: ruleSourceLogo : ( ( rule__SourceLogo__Alternatives ) ) ;
    public final void ruleSourceLogo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:164:1: ( ( ( rule__SourceLogo__Alternatives ) ) )
            // InternalMyDsl.g:165:2: ( ( rule__SourceLogo__Alternatives ) )
            {
            // InternalMyDsl.g:165:2: ( ( rule__SourceLogo__Alternatives ) )
            // InternalMyDsl.g:166:3: ( rule__SourceLogo__Alternatives )
            {
             before(grammarAccess.getSourceLogoAccess().getAlternatives()); 
            // InternalMyDsl.g:167:3: ( rule__SourceLogo__Alternatives )
            // InternalMyDsl.g:167:4: rule__SourceLogo__Alternatives
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
    // InternalMyDsl.g:176:1: ruleSourceName : ( ( rule__SourceName__Alternatives ) ) ;
    public final void ruleSourceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:180:1: ( ( ( rule__SourceName__Alternatives ) ) )
            // InternalMyDsl.g:181:2: ( ( rule__SourceName__Alternatives ) )
            {
            // InternalMyDsl.g:181:2: ( ( rule__SourceName__Alternatives ) )
            // InternalMyDsl.g:182:3: ( rule__SourceName__Alternatives )
            {
             before(grammarAccess.getSourceNameAccess().getAlternatives()); 
            // InternalMyDsl.g:183:3: ( rule__SourceName__Alternatives )
            // InternalMyDsl.g:183:4: rule__SourceName__Alternatives
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
    // InternalMyDsl.g:191:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:195:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:196:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:196:2: ( RULE_STRING )
                    // InternalMyDsl.g:197:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:202:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:202:2: ( RULE_ID )
                    // InternalMyDsl.g:203:3: RULE_ID
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
    // InternalMyDsl.g:212:1: rule__SourceMenu__Alternatives : ( ( ( 'SideBar' ) ) | ( ( 'NavBar' ) ) );
    public final void rule__SourceMenu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( ( ( 'SideBar' ) ) | ( ( 'NavBar' ) ) )
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
                    // InternalMyDsl.g:217:2: ( ( 'SideBar' ) )
                    {
                    // InternalMyDsl.g:217:2: ( ( 'SideBar' ) )
                    // InternalMyDsl.g:218:3: ( 'SideBar' )
                    {
                     before(grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:219:3: ( 'SideBar' )
                    // InternalMyDsl.g:219:4: 'SideBar'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceMenuAccess().getSideBarEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:223:2: ( ( 'NavBar' ) )
                    {
                    // InternalMyDsl.g:223:2: ( ( 'NavBar' ) )
                    // InternalMyDsl.g:224:3: ( 'NavBar' )
                    {
                     before(grammarAccess.getSourceMenuAccess().getNavBarEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:225:3: ( 'NavBar' )
                    // InternalMyDsl.g:225:4: 'NavBar'
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


    // $ANTLR start "rule__SourcePres__Alternatives"
    // InternalMyDsl.g:233:1: rule__SourcePres__Alternatives : ( ( ( 'basique' ) ) | ( ( 'card' ) ) );
    public final void rule__SourcePres__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( ( ( 'basique' ) ) | ( ( 'card' ) ) )
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
                    // InternalMyDsl.g:238:2: ( ( 'basique' ) )
                    {
                    // InternalMyDsl.g:238:2: ( ( 'basique' ) )
                    // InternalMyDsl.g:239:3: ( 'basique' )
                    {
                     before(grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:240:3: ( 'basique' )
                    // InternalMyDsl.g:240:4: 'basique'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourcePresAccess().getBasiqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:244:2: ( ( 'card' ) )
                    {
                    // InternalMyDsl.g:244:2: ( ( 'card' ) )
                    // InternalMyDsl.g:245:3: ( 'card' )
                    {
                     before(grammarAccess.getSourcePresAccess().getCardEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:246:3: ( 'card' )
                    // InternalMyDsl.g:246:4: 'card'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:254:1: rule__SourceLogo__Alternatives : ( ( ( 'comute' ) ) | ( ( 'rdv' ) ) | ( ( 'trajet' ) ) );
    public final void rule__SourceLogo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( ( ( 'comute' ) ) | ( ( 'rdv' ) ) | ( ( 'trajet' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:259:2: ( ( 'comute' ) )
                    {
                    // InternalMyDsl.g:259:2: ( ( 'comute' ) )
                    // InternalMyDsl.g:260:3: ( 'comute' )
                    {
                     before(grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:261:3: ( 'comute' )
                    // InternalMyDsl.g:261:4: 'comute'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceLogoAccess().getComuteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:265:2: ( ( 'rdv' ) )
                    {
                    // InternalMyDsl.g:265:2: ( ( 'rdv' ) )
                    // InternalMyDsl.g:266:3: ( 'rdv' )
                    {
                     before(grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:267:3: ( 'rdv' )
                    // InternalMyDsl.g:267:4: 'rdv'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceLogoAccess().getRdvEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:271:2: ( ( 'trajet' ) )
                    {
                    // InternalMyDsl.g:271:2: ( ( 'trajet' ) )
                    // InternalMyDsl.g:272:3: ( 'trajet' )
                    {
                     before(grammarAccess.getSourceLogoAccess().getTrajetEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:273:3: ( 'trajet' )
                    // InternalMyDsl.g:273:4: 'trajet'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:281:1: rule__SourceName__Alternatives : ( ( ( 'Tisseo' ) ) | ( ( 'GoogleMap' ) ) );
    public final void rule__SourceName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:285:1: ( ( ( 'Tisseo' ) ) | ( ( 'GoogleMap' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:286:2: ( ( 'Tisseo' ) )
                    {
                    // InternalMyDsl.g:286:2: ( ( 'Tisseo' ) )
                    // InternalMyDsl.g:287:3: ( 'Tisseo' )
                    {
                     before(grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:288:3: ( 'Tisseo' )
                    // InternalMyDsl.g:288:4: 'Tisseo'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceNameAccess().getTisseoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:292:2: ( ( 'GoogleMap' ) )
                    {
                    // InternalMyDsl.g:292:2: ( ( 'GoogleMap' ) )
                    // InternalMyDsl.g:293:3: ( 'GoogleMap' )
                    {
                     before(grammarAccess.getSourceNameAccess().getGoogleMapEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:294:3: ( 'GoogleMap' )
                    // InternalMyDsl.g:294:4: 'GoogleMap'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:302:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalMyDsl.g:307:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalMyDsl.g:314:1: rule__Page__Group__0__Impl : ( ( rule__Page__GeolocalisationAssignment_0 )? ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( ( ( rule__Page__GeolocalisationAssignment_0 )? ) )
            // InternalMyDsl.g:319:1: ( ( rule__Page__GeolocalisationAssignment_0 )? )
            {
            // InternalMyDsl.g:319:1: ( ( rule__Page__GeolocalisationAssignment_0 )? )
            // InternalMyDsl.g:320:2: ( rule__Page__GeolocalisationAssignment_0 )?
            {
             before(grammarAccess.getPageAccess().getGeolocalisationAssignment_0()); 
            // InternalMyDsl.g:321:2: ( rule__Page__GeolocalisationAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:321:3: rule__Page__GeolocalisationAssignment_0
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
    // InternalMyDsl.g:329:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalMyDsl.g:334:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalMyDsl.g:341:1: rule__Page__Group__1__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( ( 'Page' ) )
            // InternalMyDsl.g:346:1: ( 'Page' )
            {
            // InternalMyDsl.g:346:1: ( 'Page' )
            // InternalMyDsl.g:347:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:356:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalMyDsl.g:361:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalMyDsl.g:368:1: rule__Page__Group__2__Impl : ( ( rule__Page__NameAssignment_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( ( ( rule__Page__NameAssignment_2 ) ) )
            // InternalMyDsl.g:373:1: ( ( rule__Page__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:373:1: ( ( rule__Page__NameAssignment_2 ) )
            // InternalMyDsl.g:374:2: ( rule__Page__NameAssignment_2 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:375:2: ( rule__Page__NameAssignment_2 )
            // InternalMyDsl.g:375:3: rule__Page__NameAssignment_2
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
    // InternalMyDsl.g:383:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalMyDsl.g:388:2: rule__Page__Group__3__Impl rule__Page__Group__4
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
    // InternalMyDsl.g:395:1: rule__Page__Group__3__Impl : ( 'description' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( 'description' ) )
            // InternalMyDsl.g:400:1: ( 'description' )
            {
            // InternalMyDsl.g:400:1: ( 'description' )
            // InternalMyDsl.g:401:2: 'description'
            {
             before(grammarAccess.getPageAccess().getDescriptionKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:410:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // InternalMyDsl.g:415:2: rule__Page__Group__4__Impl rule__Page__Group__5
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
    // InternalMyDsl.g:422:1: rule__Page__Group__4__Impl : ( ( rule__Page__DescriptionAssignment_4 ) ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( ( ( rule__Page__DescriptionAssignment_4 ) ) )
            // InternalMyDsl.g:427:1: ( ( rule__Page__DescriptionAssignment_4 ) )
            {
            // InternalMyDsl.g:427:1: ( ( rule__Page__DescriptionAssignment_4 ) )
            // InternalMyDsl.g:428:2: ( rule__Page__DescriptionAssignment_4 )
            {
             before(grammarAccess.getPageAccess().getDescriptionAssignment_4()); 
            // InternalMyDsl.g:429:2: ( rule__Page__DescriptionAssignment_4 )
            // InternalMyDsl.g:429:3: rule__Page__DescriptionAssignment_4
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
    // InternalMyDsl.g:437:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // InternalMyDsl.g:442:2: rule__Page__Group__5__Impl rule__Page__Group__6
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
    // InternalMyDsl.g:449:1: rule__Page__Group__5__Impl : ( 'mail' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( 'mail' ) )
            // InternalMyDsl.g:454:1: ( 'mail' )
            {
            // InternalMyDsl.g:454:1: ( 'mail' )
            // InternalMyDsl.g:455:2: 'mail'
            {
             before(grammarAccess.getPageAccess().getMailKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:464:1: rule__Page__Group__6 : rule__Page__Group__6__Impl rule__Page__Group__7 ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( rule__Page__Group__6__Impl rule__Page__Group__7 )
            // InternalMyDsl.g:469:2: rule__Page__Group__6__Impl rule__Page__Group__7
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
    // InternalMyDsl.g:476:1: rule__Page__Group__6__Impl : ( ( rule__Page__MailAssignment_6 ) ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( ( rule__Page__MailAssignment_6 ) ) )
            // InternalMyDsl.g:481:1: ( ( rule__Page__MailAssignment_6 ) )
            {
            // InternalMyDsl.g:481:1: ( ( rule__Page__MailAssignment_6 ) )
            // InternalMyDsl.g:482:2: ( rule__Page__MailAssignment_6 )
            {
             before(grammarAccess.getPageAccess().getMailAssignment_6()); 
            // InternalMyDsl.g:483:2: ( rule__Page__MailAssignment_6 )
            // InternalMyDsl.g:483:3: rule__Page__MailAssignment_6
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
    // InternalMyDsl.g:491:1: rule__Page__Group__7 : rule__Page__Group__7__Impl rule__Page__Group__8 ;
    public final void rule__Page__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( rule__Page__Group__7__Impl rule__Page__Group__8 )
            // InternalMyDsl.g:496:2: rule__Page__Group__7__Impl rule__Page__Group__8
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
    // InternalMyDsl.g:503:1: rule__Page__Group__7__Impl : ( 'telephone' ) ;
    public final void rule__Page__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( 'telephone' ) )
            // InternalMyDsl.g:508:1: ( 'telephone' )
            {
            // InternalMyDsl.g:508:1: ( 'telephone' )
            // InternalMyDsl.g:509:2: 'telephone'
            {
             before(grammarAccess.getPageAccess().getTelephoneKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:518:1: rule__Page__Group__8 : rule__Page__Group__8__Impl rule__Page__Group__9 ;
    public final void rule__Page__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( rule__Page__Group__8__Impl rule__Page__Group__9 )
            // InternalMyDsl.g:523:2: rule__Page__Group__8__Impl rule__Page__Group__9
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
    // InternalMyDsl.g:530:1: rule__Page__Group__8__Impl : ( ( rule__Page__TelephoneAssignment_8 ) ) ;
    public final void rule__Page__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( ( ( rule__Page__TelephoneAssignment_8 ) ) )
            // InternalMyDsl.g:535:1: ( ( rule__Page__TelephoneAssignment_8 ) )
            {
            // InternalMyDsl.g:535:1: ( ( rule__Page__TelephoneAssignment_8 ) )
            // InternalMyDsl.g:536:2: ( rule__Page__TelephoneAssignment_8 )
            {
             before(grammarAccess.getPageAccess().getTelephoneAssignment_8()); 
            // InternalMyDsl.g:537:2: ( rule__Page__TelephoneAssignment_8 )
            // InternalMyDsl.g:537:3: rule__Page__TelephoneAssignment_8
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
    // InternalMyDsl.g:545:1: rule__Page__Group__9 : rule__Page__Group__9__Impl rule__Page__Group__10 ;
    public final void rule__Page__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( rule__Page__Group__9__Impl rule__Page__Group__10 )
            // InternalMyDsl.g:550:2: rule__Page__Group__9__Impl rule__Page__Group__10
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:557:1: rule__Page__Group__9__Impl : ( 'heure_ouverture' ) ;
    public final void rule__Page__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( 'heure_ouverture' ) )
            // InternalMyDsl.g:562:1: ( 'heure_ouverture' )
            {
            // InternalMyDsl.g:562:1: ( 'heure_ouverture' )
            // InternalMyDsl.g:563:2: 'heure_ouverture'
            {
             before(grammarAccess.getPageAccess().getHeure_ouvertureKeyword_9()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:572:1: rule__Page__Group__10 : rule__Page__Group__10__Impl rule__Page__Group__11 ;
    public final void rule__Page__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( rule__Page__Group__10__Impl rule__Page__Group__11 )
            // InternalMyDsl.g:577:2: rule__Page__Group__10__Impl rule__Page__Group__11
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:584:1: rule__Page__Group__10__Impl : ( ( rule__Page__Heure_ouvertureAssignment_10 ) ) ;
    public final void rule__Page__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( ( ( rule__Page__Heure_ouvertureAssignment_10 ) ) )
            // InternalMyDsl.g:589:1: ( ( rule__Page__Heure_ouvertureAssignment_10 ) )
            {
            // InternalMyDsl.g:589:1: ( ( rule__Page__Heure_ouvertureAssignment_10 ) )
            // InternalMyDsl.g:590:2: ( rule__Page__Heure_ouvertureAssignment_10 )
            {
             before(grammarAccess.getPageAccess().getHeure_ouvertureAssignment_10()); 
            // InternalMyDsl.g:591:2: ( rule__Page__Heure_ouvertureAssignment_10 )
            // InternalMyDsl.g:591:3: rule__Page__Heure_ouvertureAssignment_10
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
    // InternalMyDsl.g:599:1: rule__Page__Group__11 : rule__Page__Group__11__Impl rule__Page__Group__12 ;
    public final void rule__Page__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( rule__Page__Group__11__Impl rule__Page__Group__12 )
            // InternalMyDsl.g:604:2: rule__Page__Group__11__Impl rule__Page__Group__12
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:611:1: rule__Page__Group__11__Impl : ( 'heure_fermeture' ) ;
    public final void rule__Page__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( ( 'heure_fermeture' ) )
            // InternalMyDsl.g:616:1: ( 'heure_fermeture' )
            {
            // InternalMyDsl.g:616:1: ( 'heure_fermeture' )
            // InternalMyDsl.g:617:2: 'heure_fermeture'
            {
             before(grammarAccess.getPageAccess().getHeure_fermetureKeyword_11()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:626:1: rule__Page__Group__12 : rule__Page__Group__12__Impl rule__Page__Group__13 ;
    public final void rule__Page__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( rule__Page__Group__12__Impl rule__Page__Group__13 )
            // InternalMyDsl.g:631:2: rule__Page__Group__12__Impl rule__Page__Group__13
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:638:1: rule__Page__Group__12__Impl : ( ( rule__Page__Heure_fermetureAssignment_12 ) ) ;
    public final void rule__Page__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( ( rule__Page__Heure_fermetureAssignment_12 ) ) )
            // InternalMyDsl.g:643:1: ( ( rule__Page__Heure_fermetureAssignment_12 ) )
            {
            // InternalMyDsl.g:643:1: ( ( rule__Page__Heure_fermetureAssignment_12 ) )
            // InternalMyDsl.g:644:2: ( rule__Page__Heure_fermetureAssignment_12 )
            {
             before(grammarAccess.getPageAccess().getHeure_fermetureAssignment_12()); 
            // InternalMyDsl.g:645:2: ( rule__Page__Heure_fermetureAssignment_12 )
            // InternalMyDsl.g:645:3: rule__Page__Heure_fermetureAssignment_12
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
    // InternalMyDsl.g:653:1: rule__Page__Group__13 : rule__Page__Group__13__Impl rule__Page__Group__14 ;
    public final void rule__Page__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( rule__Page__Group__13__Impl rule__Page__Group__14 )
            // InternalMyDsl.g:658:2: rule__Page__Group__13__Impl rule__Page__Group__14
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:665:1: rule__Page__Group__13__Impl : ( 'nb_Pers' ) ;
    public final void rule__Page__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( ( 'nb_Pers' ) )
            // InternalMyDsl.g:670:1: ( 'nb_Pers' )
            {
            // InternalMyDsl.g:670:1: ( 'nb_Pers' )
            // InternalMyDsl.g:671:2: 'nb_Pers'
            {
             before(grammarAccess.getPageAccess().getNb_PersKeyword_13()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:680:1: rule__Page__Group__14 : rule__Page__Group__14__Impl rule__Page__Group__15 ;
    public final void rule__Page__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( rule__Page__Group__14__Impl rule__Page__Group__15 )
            // InternalMyDsl.g:685:2: rule__Page__Group__14__Impl rule__Page__Group__15
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:692:1: rule__Page__Group__14__Impl : ( ( rule__Page__Nb_PersAssignment_14 ) ) ;
    public final void rule__Page__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( ( rule__Page__Nb_PersAssignment_14 ) ) )
            // InternalMyDsl.g:697:1: ( ( rule__Page__Nb_PersAssignment_14 ) )
            {
            // InternalMyDsl.g:697:1: ( ( rule__Page__Nb_PersAssignment_14 ) )
            // InternalMyDsl.g:698:2: ( rule__Page__Nb_PersAssignment_14 )
            {
             before(grammarAccess.getPageAccess().getNb_PersAssignment_14()); 
            // InternalMyDsl.g:699:2: ( rule__Page__Nb_PersAssignment_14 )
            // InternalMyDsl.g:699:3: rule__Page__Nb_PersAssignment_14
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
    // InternalMyDsl.g:707:1: rule__Page__Group__15 : rule__Page__Group__15__Impl rule__Page__Group__16 ;
    public final void rule__Page__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( rule__Page__Group__15__Impl rule__Page__Group__16 )
            // InternalMyDsl.g:712:2: rule__Page__Group__15__Impl rule__Page__Group__16
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:719:1: rule__Page__Group__15__Impl : ( ( rule__Page__Group_15__0 )? ) ;
    public final void rule__Page__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ( rule__Page__Group_15__0 )? ) )
            // InternalMyDsl.g:724:1: ( ( rule__Page__Group_15__0 )? )
            {
            // InternalMyDsl.g:724:1: ( ( rule__Page__Group_15__0 )? )
            // InternalMyDsl.g:725:2: ( rule__Page__Group_15__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_15()); 
            // InternalMyDsl.g:726:2: ( rule__Page__Group_15__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:726:3: rule__Page__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_15()); 

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
    // InternalMyDsl.g:734:1: rule__Page__Group__16 : rule__Page__Group__16__Impl rule__Page__Group__17 ;
    public final void rule__Page__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( rule__Page__Group__16__Impl rule__Page__Group__17 )
            // InternalMyDsl.g:739:2: rule__Page__Group__16__Impl rule__Page__Group__17
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:746:1: rule__Page__Group__16__Impl : ( ( rule__Page__Group_16__0 )? ) ;
    public final void rule__Page__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ( rule__Page__Group_16__0 )? ) )
            // InternalMyDsl.g:751:1: ( ( rule__Page__Group_16__0 )? )
            {
            // InternalMyDsl.g:751:1: ( ( rule__Page__Group_16__0 )? )
            // InternalMyDsl.g:752:2: ( rule__Page__Group_16__0 )?
            {
             before(grammarAccess.getPageAccess().getGroup_16()); 
            // InternalMyDsl.g:753:2: ( rule__Page__Group_16__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:753:3: rule__Page__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Page__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getGroup_16()); 

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
    // InternalMyDsl.g:761:1: rule__Page__Group__17 : rule__Page__Group__17__Impl rule__Page__Group__18 ;
    public final void rule__Page__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( rule__Page__Group__17__Impl rule__Page__Group__18 )
            // InternalMyDsl.g:766:2: rule__Page__Group__17__Impl rule__Page__Group__18
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:773:1: rule__Page__Group__17__Impl : ( 'menu' ) ;
    public final void rule__Page__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( 'menu' ) )
            // InternalMyDsl.g:778:1: ( 'menu' )
            {
            // InternalMyDsl.g:778:1: ( 'menu' )
            // InternalMyDsl.g:779:2: 'menu'
            {
             before(grammarAccess.getPageAccess().getMenuKeyword_17()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getMenuKeyword_17()); 

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
    // InternalMyDsl.g:788:1: rule__Page__Group__18 : rule__Page__Group__18__Impl rule__Page__Group__19 ;
    public final void rule__Page__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( rule__Page__Group__18__Impl rule__Page__Group__19 )
            // InternalMyDsl.g:793:2: rule__Page__Group__18__Impl rule__Page__Group__19
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:800:1: rule__Page__Group__18__Impl : ( ( rule__Page__MenuAssignment_18 ) ) ;
    public final void rule__Page__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( ( rule__Page__MenuAssignment_18 ) ) )
            // InternalMyDsl.g:805:1: ( ( rule__Page__MenuAssignment_18 ) )
            {
            // InternalMyDsl.g:805:1: ( ( rule__Page__MenuAssignment_18 ) )
            // InternalMyDsl.g:806:2: ( rule__Page__MenuAssignment_18 )
            {
             before(grammarAccess.getPageAccess().getMenuAssignment_18()); 
            // InternalMyDsl.g:807:2: ( rule__Page__MenuAssignment_18 )
            // InternalMyDsl.g:807:3: rule__Page__MenuAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Page__MenuAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getMenuAssignment_18()); 

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
    // InternalMyDsl.g:815:1: rule__Page__Group__19 : rule__Page__Group__19__Impl rule__Page__Group__20 ;
    public final void rule__Page__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( rule__Page__Group__19__Impl rule__Page__Group__20 )
            // InternalMyDsl.g:820:2: rule__Page__Group__19__Impl rule__Page__Group__20
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:827:1: rule__Page__Group__19__Impl : ( 'presentation' ) ;
    public final void rule__Page__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( 'presentation' ) )
            // InternalMyDsl.g:832:1: ( 'presentation' )
            {
            // InternalMyDsl.g:832:1: ( 'presentation' )
            // InternalMyDsl.g:833:2: 'presentation'
            {
             before(grammarAccess.getPageAccess().getPresentationKeyword_19()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:842:1: rule__Page__Group__20 : rule__Page__Group__20__Impl rule__Page__Group__21 ;
    public final void rule__Page__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:846:1: ( rule__Page__Group__20__Impl rule__Page__Group__21 )
            // InternalMyDsl.g:847:2: rule__Page__Group__20__Impl rule__Page__Group__21
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:854:1: rule__Page__Group__20__Impl : ( ( rule__Page__PresentationAssignment_20 ) ) ;
    public final void rule__Page__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( ( rule__Page__PresentationAssignment_20 ) ) )
            // InternalMyDsl.g:859:1: ( ( rule__Page__PresentationAssignment_20 ) )
            {
            // InternalMyDsl.g:859:1: ( ( rule__Page__PresentationAssignment_20 ) )
            // InternalMyDsl.g:860:2: ( rule__Page__PresentationAssignment_20 )
            {
             before(grammarAccess.getPageAccess().getPresentationAssignment_20()); 
            // InternalMyDsl.g:861:2: ( rule__Page__PresentationAssignment_20 )
            // InternalMyDsl.g:861:3: rule__Page__PresentationAssignment_20
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
    // InternalMyDsl.g:869:1: rule__Page__Group__21 : rule__Page__Group__21__Impl rule__Page__Group__22 ;
    public final void rule__Page__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( rule__Page__Group__21__Impl rule__Page__Group__22 )
            // InternalMyDsl.g:874:2: rule__Page__Group__21__Impl rule__Page__Group__22
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:881:1: rule__Page__Group__21__Impl : ( 'logo' ) ;
    public final void rule__Page__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( 'logo' ) )
            // InternalMyDsl.g:886:1: ( 'logo' )
            {
            // InternalMyDsl.g:886:1: ( 'logo' )
            // InternalMyDsl.g:887:2: 'logo'
            {
             before(grammarAccess.getPageAccess().getLogoKeyword_21()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:896:1: rule__Page__Group__22 : rule__Page__Group__22__Impl rule__Page__Group__23 ;
    public final void rule__Page__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( rule__Page__Group__22__Impl rule__Page__Group__23 )
            // InternalMyDsl.g:901:2: rule__Page__Group__22__Impl rule__Page__Group__23
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:908:1: rule__Page__Group__22__Impl : ( ( rule__Page__LogoAssignment_22 ) ) ;
    public final void rule__Page__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( ( ( rule__Page__LogoAssignment_22 ) ) )
            // InternalMyDsl.g:913:1: ( ( rule__Page__LogoAssignment_22 ) )
            {
            // InternalMyDsl.g:913:1: ( ( rule__Page__LogoAssignment_22 ) )
            // InternalMyDsl.g:914:2: ( rule__Page__LogoAssignment_22 )
            {
             before(grammarAccess.getPageAccess().getLogoAssignment_22()); 
            // InternalMyDsl.g:915:2: ( rule__Page__LogoAssignment_22 )
            // InternalMyDsl.g:915:3: rule__Page__LogoAssignment_22
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
    // InternalMyDsl.g:923:1: rule__Page__Group__23 : rule__Page__Group__23__Impl rule__Page__Group__24 ;
    public final void rule__Page__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( rule__Page__Group__23__Impl rule__Page__Group__24 )
            // InternalMyDsl.g:928:2: rule__Page__Group__23__Impl rule__Page__Group__24
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:935:1: rule__Page__Group__23__Impl : ( 'source' ) ;
    public final void rule__Page__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( 'source' ) )
            // InternalMyDsl.g:940:1: ( 'source' )
            {
            // InternalMyDsl.g:940:1: ( 'source' )
            // InternalMyDsl.g:941:2: 'source'
            {
             before(grammarAccess.getPageAccess().getSourceKeyword_23()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:950:1: rule__Page__Group__24 : rule__Page__Group__24__Impl rule__Page__Group__25 ;
    public final void rule__Page__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( rule__Page__Group__24__Impl rule__Page__Group__25 )
            // InternalMyDsl.g:955:2: rule__Page__Group__24__Impl rule__Page__Group__25
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:962:1: rule__Page__Group__24__Impl : ( ( rule__Page__SourceAssignment_24 ) ) ;
    public final void rule__Page__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( ( ( rule__Page__SourceAssignment_24 ) ) )
            // InternalMyDsl.g:967:1: ( ( rule__Page__SourceAssignment_24 ) )
            {
            // InternalMyDsl.g:967:1: ( ( rule__Page__SourceAssignment_24 ) )
            // InternalMyDsl.g:968:2: ( rule__Page__SourceAssignment_24 )
            {
             before(grammarAccess.getPageAccess().getSourceAssignment_24()); 
            // InternalMyDsl.g:969:2: ( rule__Page__SourceAssignment_24 )
            // InternalMyDsl.g:969:3: rule__Page__SourceAssignment_24
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
    // InternalMyDsl.g:977:1: rule__Page__Group__25 : rule__Page__Group__25__Impl ;
    public final void rule__Page__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( rule__Page__Group__25__Impl )
            // InternalMyDsl.g:982:2: rule__Page__Group__25__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__25__Impl();

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
    // InternalMyDsl.g:988:1: rule__Page__Group__25__Impl : ( ( rule__Page__Group_25__0 )* ) ;
    public final void rule__Page__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( ( ( rule__Page__Group_25__0 )* ) )
            // InternalMyDsl.g:993:1: ( ( rule__Page__Group_25__0 )* )
            {
            // InternalMyDsl.g:993:1: ( ( rule__Page__Group_25__0 )* )
            // InternalMyDsl.g:994:2: ( rule__Page__Group_25__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_25()); 
            // InternalMyDsl.g:995:2: ( rule__Page__Group_25__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:995:3: rule__Page__Group_25__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Page__Group_25__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Page__Group_15__0"
    // InternalMyDsl.g:1004:1: rule__Page__Group_15__0 : rule__Page__Group_15__0__Impl rule__Page__Group_15__1 ;
    public final void rule__Page__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( rule__Page__Group_15__0__Impl rule__Page__Group_15__1 )
            // InternalMyDsl.g:1009:2: rule__Page__Group_15__0__Impl rule__Page__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_15__1();

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
    // $ANTLR end "rule__Page__Group_15__0"


    // $ANTLR start "rule__Page__Group_15__0__Impl"
    // InternalMyDsl.g:1016:1: rule__Page__Group_15__0__Impl : ( 'Port_back' ) ;
    public final void rule__Page__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( ( 'Port_back' ) )
            // InternalMyDsl.g:1021:1: ( 'Port_back' )
            {
            // InternalMyDsl.g:1021:1: ( 'Port_back' )
            // InternalMyDsl.g:1022:2: 'Port_back'
            {
             before(grammarAccess.getPageAccess().getPort_backKeyword_15_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPort_backKeyword_15_0()); 

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
    // $ANTLR end "rule__Page__Group_15__0__Impl"


    // $ANTLR start "rule__Page__Group_15__1"
    // InternalMyDsl.g:1031:1: rule__Page__Group_15__1 : rule__Page__Group_15__1__Impl ;
    public final void rule__Page__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( rule__Page__Group_15__1__Impl )
            // InternalMyDsl.g:1036:2: rule__Page__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_15__1__Impl();

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
    // $ANTLR end "rule__Page__Group_15__1"


    // $ANTLR start "rule__Page__Group_15__1__Impl"
    // InternalMyDsl.g:1042:1: rule__Page__Group_15__1__Impl : ( ( rule__Page__Port_backAssignment_15_1 ) ) ;
    public final void rule__Page__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( ( rule__Page__Port_backAssignment_15_1 ) ) )
            // InternalMyDsl.g:1047:1: ( ( rule__Page__Port_backAssignment_15_1 ) )
            {
            // InternalMyDsl.g:1047:1: ( ( rule__Page__Port_backAssignment_15_1 ) )
            // InternalMyDsl.g:1048:2: ( rule__Page__Port_backAssignment_15_1 )
            {
             before(grammarAccess.getPageAccess().getPort_backAssignment_15_1()); 
            // InternalMyDsl.g:1049:2: ( rule__Page__Port_backAssignment_15_1 )
            // InternalMyDsl.g:1049:3: rule__Page__Port_backAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__Port_backAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getPort_backAssignment_15_1()); 

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
    // $ANTLR end "rule__Page__Group_15__1__Impl"


    // $ANTLR start "rule__Page__Group_16__0"
    // InternalMyDsl.g:1058:1: rule__Page__Group_16__0 : rule__Page__Group_16__0__Impl rule__Page__Group_16__1 ;
    public final void rule__Page__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( rule__Page__Group_16__0__Impl rule__Page__Group_16__1 )
            // InternalMyDsl.g:1063:2: rule__Page__Group_16__0__Impl rule__Page__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group_16__1();

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
    // $ANTLR end "rule__Page__Group_16__0"


    // $ANTLR start "rule__Page__Group_16__0__Impl"
    // InternalMyDsl.g:1070:1: rule__Page__Group_16__0__Impl : ( 'Port_front' ) ;
    public final void rule__Page__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( 'Port_front' ) )
            // InternalMyDsl.g:1075:1: ( 'Port_front' )
            {
            // InternalMyDsl.g:1075:1: ( 'Port_front' )
            // InternalMyDsl.g:1076:2: 'Port_front'
            {
             before(grammarAccess.getPageAccess().getPort_frontKeyword_16_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPort_frontKeyword_16_0()); 

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
    // $ANTLR end "rule__Page__Group_16__0__Impl"


    // $ANTLR start "rule__Page__Group_16__1"
    // InternalMyDsl.g:1085:1: rule__Page__Group_16__1 : rule__Page__Group_16__1__Impl ;
    public final void rule__Page__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( rule__Page__Group_16__1__Impl )
            // InternalMyDsl.g:1090:2: rule__Page__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group_16__1__Impl();

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
    // $ANTLR end "rule__Page__Group_16__1"


    // $ANTLR start "rule__Page__Group_16__1__Impl"
    // InternalMyDsl.g:1096:1: rule__Page__Group_16__1__Impl : ( ( rule__Page__Port_frontAssignment_16_1 ) ) ;
    public final void rule__Page__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( ( ( rule__Page__Port_frontAssignment_16_1 ) ) )
            // InternalMyDsl.g:1101:1: ( ( rule__Page__Port_frontAssignment_16_1 ) )
            {
            // InternalMyDsl.g:1101:1: ( ( rule__Page__Port_frontAssignment_16_1 ) )
            // InternalMyDsl.g:1102:2: ( rule__Page__Port_frontAssignment_16_1 )
            {
             before(grammarAccess.getPageAccess().getPort_frontAssignment_16_1()); 
            // InternalMyDsl.g:1103:2: ( rule__Page__Port_frontAssignment_16_1 )
            // InternalMyDsl.g:1103:3: rule__Page__Port_frontAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__Port_frontAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getPort_frontAssignment_16_1()); 

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
    // $ANTLR end "rule__Page__Group_16__1__Impl"


    // $ANTLR start "rule__Page__Group_25__0"
    // InternalMyDsl.g:1112:1: rule__Page__Group_25__0 : rule__Page__Group_25__0__Impl rule__Page__Group_25__1 ;
    public final void rule__Page__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( rule__Page__Group_25__0__Impl rule__Page__Group_25__1 )
            // InternalMyDsl.g:1117:2: rule__Page__Group_25__0__Impl rule__Page__Group_25__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1124:1: rule__Page__Group_25__0__Impl : ( ',' ) ;
    public final void rule__Page__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( ( ',' ) )
            // InternalMyDsl.g:1129:1: ( ',' )
            {
            // InternalMyDsl.g:1129:1: ( ',' )
            // InternalMyDsl.g:1130:2: ','
            {
             before(grammarAccess.getPageAccess().getCommaKeyword_25_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1139:1: rule__Page__Group_25__1 : rule__Page__Group_25__1__Impl ;
    public final void rule__Page__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( rule__Page__Group_25__1__Impl )
            // InternalMyDsl.g:1144:2: rule__Page__Group_25__1__Impl
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
    // InternalMyDsl.g:1150:1: rule__Page__Group_25__1__Impl : ( ( rule__Page__SourceAssignment_25_1 ) ) ;
    public final void rule__Page__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( ( ( rule__Page__SourceAssignment_25_1 ) ) )
            // InternalMyDsl.g:1155:1: ( ( rule__Page__SourceAssignment_25_1 ) )
            {
            // InternalMyDsl.g:1155:1: ( ( rule__Page__SourceAssignment_25_1 ) )
            // InternalMyDsl.g:1156:2: ( rule__Page__SourceAssignment_25_1 )
            {
             before(grammarAccess.getPageAccess().getSourceAssignment_25_1()); 
            // InternalMyDsl.g:1157:2: ( rule__Page__SourceAssignment_25_1 )
            // InternalMyDsl.g:1157:3: rule__Page__SourceAssignment_25_1
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


    // $ANTLR start "rule__Source__Group__0"
    // InternalMyDsl.g:1166:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalMyDsl.g:1171:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1178:1: rule__Source__Group__0__Impl : ( () ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( ( () ) )
            // InternalMyDsl.g:1183:1: ( () )
            {
            // InternalMyDsl.g:1183:1: ( () )
            // InternalMyDsl.g:1184:2: ()
            {
             before(grammarAccess.getSourceAccess().getSourceAction_0()); 
            // InternalMyDsl.g:1185:2: ()
            // InternalMyDsl.g:1185:3: 
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
    // InternalMyDsl.g:1193:1: rule__Source__Group__1 : rule__Source__Group__1__Impl ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( rule__Source__Group__1__Impl )
            // InternalMyDsl.g:1198:2: rule__Source__Group__1__Impl
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
    // InternalMyDsl.g:1204:1: rule__Source__Group__1__Impl : ( ( rule__Source__NameAssignment_1 )? ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( ( ( rule__Source__NameAssignment_1 )? ) )
            // InternalMyDsl.g:1209:1: ( ( rule__Source__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:1209:1: ( ( rule__Source__NameAssignment_1 )? )
            // InternalMyDsl.g:1210:2: ( rule__Source__NameAssignment_1 )?
            {
             before(grammarAccess.getSourceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1211:2: ( rule__Source__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=18 && LA10_0<=19)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1211:3: rule__Source__NameAssignment_1
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


    // $ANTLR start "rule__Page__GeolocalisationAssignment_0"
    // InternalMyDsl.g:1220:1: rule__Page__GeolocalisationAssignment_0 : ( ( 'geolocalisation' ) ) ;
    public final void rule__Page__GeolocalisationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ( 'geolocalisation' ) ) )
            // InternalMyDsl.g:1225:2: ( ( 'geolocalisation' ) )
            {
            // InternalMyDsl.g:1225:2: ( ( 'geolocalisation' ) )
            // InternalMyDsl.g:1226:3: ( 'geolocalisation' )
            {
             before(grammarAccess.getPageAccess().getGeolocalisationGeolocalisationKeyword_0_0()); 
            // InternalMyDsl.g:1227:3: ( 'geolocalisation' )
            // InternalMyDsl.g:1228:4: 'geolocalisation'
            {
             before(grammarAccess.getPageAccess().getGeolocalisationGeolocalisationKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1239:1: rule__Page__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1244:2: ( ruleEString )
            {
            // InternalMyDsl.g:1244:2: ( ruleEString )
            // InternalMyDsl.g:1245:3: ruleEString
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
    // InternalMyDsl.g:1254:1: rule__Page__DescriptionAssignment_4 : ( ruleEString ) ;
    public final void rule__Page__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1259:2: ( ruleEString )
            {
            // InternalMyDsl.g:1259:2: ( ruleEString )
            // InternalMyDsl.g:1260:3: ruleEString
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
    // InternalMyDsl.g:1269:1: rule__Page__MailAssignment_6 : ( ruleEString ) ;
    public final void rule__Page__MailAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1274:2: ( ruleEString )
            {
            // InternalMyDsl.g:1274:2: ( ruleEString )
            // InternalMyDsl.g:1275:3: ruleEString
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
    // InternalMyDsl.g:1284:1: rule__Page__TelephoneAssignment_8 : ( ruleEString ) ;
    public final void rule__Page__TelephoneAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1289:2: ( ruleEString )
            {
            // InternalMyDsl.g:1289:2: ( ruleEString )
            // InternalMyDsl.g:1290:3: ruleEString
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
    // InternalMyDsl.g:1299:1: rule__Page__Heure_ouvertureAssignment_10 : ( ruleEString ) ;
    public final void rule__Page__Heure_ouvertureAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1304:2: ( ruleEString )
            {
            // InternalMyDsl.g:1304:2: ( ruleEString )
            // InternalMyDsl.g:1305:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getHeure_ouvertureEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getHeure_ouvertureEStringParserRuleCall_10_0()); 

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
    // InternalMyDsl.g:1314:1: rule__Page__Heure_fermetureAssignment_12 : ( ruleEString ) ;
    public final void rule__Page__Heure_fermetureAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1319:2: ( ruleEString )
            {
            // InternalMyDsl.g:1319:2: ( ruleEString )
            // InternalMyDsl.g:1320:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getHeure_fermetureEStringParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getHeure_fermetureEStringParserRuleCall_12_0()); 

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
    // InternalMyDsl.g:1329:1: rule__Page__Nb_PersAssignment_14 : ( ruleEString ) ;
    public final void rule__Page__Nb_PersAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1334:2: ( ruleEString )
            {
            // InternalMyDsl.g:1334:2: ( ruleEString )
            // InternalMyDsl.g:1335:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getNb_PersEStringParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNb_PersEStringParserRuleCall_14_0()); 

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


    // $ANTLR start "rule__Page__Port_backAssignment_15_1"
    // InternalMyDsl.g:1344:1: rule__Page__Port_backAssignment_15_1 : ( ruleEString ) ;
    public final void rule__Page__Port_backAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1349:2: ( ruleEString )
            {
            // InternalMyDsl.g:1349:2: ( ruleEString )
            // InternalMyDsl.g:1350:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getPort_backEStringParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPort_backEStringParserRuleCall_15_1_0()); 

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
    // $ANTLR end "rule__Page__Port_backAssignment_15_1"


    // $ANTLR start "rule__Page__Port_frontAssignment_16_1"
    // InternalMyDsl.g:1359:1: rule__Page__Port_frontAssignment_16_1 : ( ruleEString ) ;
    public final void rule__Page__Port_frontAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1364:2: ( ruleEString )
            {
            // InternalMyDsl.g:1364:2: ( ruleEString )
            // InternalMyDsl.g:1365:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getPort_frontEStringParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPort_frontEStringParserRuleCall_16_1_0()); 

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
    // $ANTLR end "rule__Page__Port_frontAssignment_16_1"


    // $ANTLR start "rule__Page__MenuAssignment_18"
    // InternalMyDsl.g:1374:1: rule__Page__MenuAssignment_18 : ( ruleSourceMenu ) ;
    public final void rule__Page__MenuAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( ruleSourceMenu ) )
            // InternalMyDsl.g:1379:2: ( ruleSourceMenu )
            {
            // InternalMyDsl.g:1379:2: ( ruleSourceMenu )
            // InternalMyDsl.g:1380:3: ruleSourceMenu
            {
             before(grammarAccess.getPageAccess().getMenuSourceMenuEnumRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceMenu();

            state._fsp--;

             after(grammarAccess.getPageAccess().getMenuSourceMenuEnumRuleCall_18_0()); 

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
    // $ANTLR end "rule__Page__MenuAssignment_18"


    // $ANTLR start "rule__Page__PresentationAssignment_20"
    // InternalMyDsl.g:1389:1: rule__Page__PresentationAssignment_20 : ( ruleSourcePres ) ;
    public final void rule__Page__PresentationAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( ruleSourcePres ) )
            // InternalMyDsl.g:1394:2: ( ruleSourcePres )
            {
            // InternalMyDsl.g:1394:2: ( ruleSourcePres )
            // InternalMyDsl.g:1395:3: ruleSourcePres
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
    // InternalMyDsl.g:1404:1: rule__Page__LogoAssignment_22 : ( ruleSourceLogo ) ;
    public final void rule__Page__LogoAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( ( ruleSourceLogo ) )
            // InternalMyDsl.g:1409:2: ( ruleSourceLogo )
            {
            // InternalMyDsl.g:1409:2: ( ruleSourceLogo )
            // InternalMyDsl.g:1410:3: ruleSourceLogo
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
    // InternalMyDsl.g:1419:1: rule__Page__SourceAssignment_24 : ( ruleSource ) ;
    public final void rule__Page__SourceAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( ruleSource ) )
            // InternalMyDsl.g:1424:2: ( ruleSource )
            {
            // InternalMyDsl.g:1424:2: ( ruleSource )
            // InternalMyDsl.g:1425:3: ruleSource
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
    // InternalMyDsl.g:1434:1: rule__Page__SourceAssignment_25_1 : ( ruleSource ) ;
    public final void rule__Page__SourceAssignment_25_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( ruleSource ) )
            // InternalMyDsl.g:1439:2: ( ruleSource )
            {
            // InternalMyDsl.g:1439:2: ( ruleSource )
            // InternalMyDsl.g:1440:3: ruleSource
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


    // $ANTLR start "rule__Source__NameAssignment_1"
    // InternalMyDsl.g:1449:1: rule__Source__NameAssignment_1 : ( ruleSourceName ) ;
    public final void rule__Source__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( ( ruleSourceName ) )
            // InternalMyDsl.g:1454:2: ( ruleSourceName )
            {
            // InternalMyDsl.g:1454:2: ( ruleSourceName )
            // InternalMyDsl.g:1455:3: ruleSourceName
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000002L});

}