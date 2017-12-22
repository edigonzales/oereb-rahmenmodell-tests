<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
    xmlns:xsd="https://www.w3.org/2001/XMLSchema" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
    xmlns:fo="http://www.w3.org/1999/XSL/Format" 
    xmlns:data="http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData"    

    version="2.0">
    <xsl:template match="/">
        <fo:root 
            xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="titlePage" page-height="297mm" page-width="210mm" margin-top="10mm" margin-bottom="10mm" margin-left="18mm" margin-right="18mm">
                    <fo:region-body margin-top="30mm" background-color="yellow"/>
                    <fo:region-before extent="30mm" background-color="blue" />
                    <fo:region-after extent="20mm" background-color="blue"/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="titlePage">
                <fo:static-content flow-name="xsl-region-before">
                    <fo:block>
                        <fo:block-container absolute-position="absolute" top="0mm" left="0mm" background-color="#4F491D">
                            <fo:block>
                                <fo:external-graphic src="url('https://oerebfiles.apps.be.ch/logos/bund_logo.svg')" width="44mm" content-width="scale-to-fit" content-height="scale-to-fit"/>
                            </fo:block>
                        </fo:block-container>
                        <fo:block-container absolute-position="absolute" top="0mm" left="139mm" background-color="#F38222">
                            <fo:block>
                                <fo:external-graphic src="oerebkataster_logo.svg" height="10mm" width="35mm" content-width="scale-to-fit" content-height="scale-to-fit"/>
                            </fo:block>
                        </fo:block-container>
                        <fo:block-container absolute-position="absolute" top="19mm" left="0mm">
                            <fo:block>
                                <fo:leader leader-pattern="rule" leader-length="100%" rule-style="solid" rule-thickness="0.2pt"/>
                            </fo:block>
                        </fo:block-container>
                    </fo:block>
                </fo:static-content>
                <fo:flow flow-name="xsl-region-body">
                    <fo:block wrap-option="wrap" hyphenate="false" hyphenation-character="-" font-weight="700" font-size="18pt" font-family="Cadastra">Auszug aus dem Kataster der öffentlich-rechtlichen Eigentumsbeschränkungen (ÖREB-Kataster)</fo:block>

                    <xsl:apply-templates/>

                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    <xsl:template match="data:Extract">
        <fo:block-container font-size="12pt" margin-left="5mm" margin-bottom="5mm">
        <fo:block>
           gaga
        </fo:block>
        <fo:block>
            <xsl:value-of select="data:CreationDate"/>
        </fo:block>
        <fo:block>
            <xsl:value-of select="format-dateTime(data:CreationDate, '[D01].[M01].[Y0001]')"/>
        </fo:block>
        

            <!-- <xsl:apply-templates select="data:CreationDate"/> -->
        </fo:block-container>
    </xsl:template>
    <!--
    <xsl:template match="data:CreationDate">
        <fo:block>
            <xsl:value-of select="."/>
        </fo:block>
        <fo:block>
           asdfasdfasdf
        </fo:block>
        
    </xsl:template>
    -->
</xsl:stylesheet>